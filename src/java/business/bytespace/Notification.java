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
public class Notification extends User implements Serializable{
    private Integer notificationID;
    private String notificationInfo;
    
    public Notification(){
        notificationID = null;
        notificationInfo = null;
    }

    public Notification(Integer notificationID, String notificationInfo) {
        this.notificationID = notificationID;
        this.notificationInfo = notificationInfo;
    }

    public Integer getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Integer notificationID) {
        this.notificationID = notificationID;
    }

    public String getNotificationInfo() {
        return notificationInfo;
    }

    public void setNotificationInfo(String notificationInfo) {
        this.notificationInfo = notificationInfo;
    }
    
    
    
    
}
