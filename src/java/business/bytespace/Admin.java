/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.bytespace;

import business.bytespace.Super.User;
import java.io.Serializable;

/**
 *
 * @author raren
 */
public class Admin extends User implements Serializable  {
        private String employeeID;
        
        public Admin(){
            employeeID = null;
        }

        public Admin(String employeeID) {
            this.employeeID = employeeID;
        }
        
        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
        }
        
        
}
