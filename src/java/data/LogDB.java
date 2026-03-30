/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author raren
 */
public class LogDB {
     
    public static boolean deleteLogsForUser(int userID){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
       
        int result = -1;
        
        boolean logDeleted = false; 
        
        String query = """
                       DELETE FROM log
                       WHERE logged_user_id = ?;
                       """;
        try{
            ps = connection.prepareStatement(query);
            ps.setInt(1, userID);

            result = ps.executeUpdate();
            System.out.println("LogDB -> deleteLogsForUser() -> Delete executed -> rows effected -> " + result);
            logDeleted = true;

        }catch(SQLException ex){
            System.out.println("LogDB -> deleteLogsForUser() failed-> \nExcetion -> " + ex +"\n") ;
        }

        DBUtil.closePreparedStatement(ps);
        pool.freeConnection(connection);
        
        return logDeleted;
    } 
     
     
    public static void createLoginLog(int logID, int userID, int actionID, String logText) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
         
        int result = -1;
        ResultSet rs = null;
        
        String query =
                """
                INSERT INTO log
                (log_id, logged_user_id, logged_action_id, log_text)
                values
                (?, ?, ?, ?)
                """;
              
        try 
        {      
            ps = connection.prepareStatement(query);
            ps.setInt(1, logID);
            ps.setInt(2, userID);
            ps.setInt(3, actionID);
            ps.setString(4, logText);
                        
            result = ps.executeUpdate();
            System.out.println("LogDB -> createLoginLog() -> Creation Executed -> rows effected -> " + result);
        } 
        catch (SQLException ex) 
        {
            System.out.println("LogDB -> createLoginLog() failed-> \nExcetion -> " + ex +"\n") ;
        }
    }
     
}
