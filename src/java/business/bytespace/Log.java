/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.bytespace;

import java.io.Serializable;

/**
 *
 * @author raren
 */
public class Log implements Serializable {
    private Integer logID;
    private Integer loggedAccountID;
    private Integer loggedAction;
    private String logNotes;

    public Log() {
           logID = null;
           loggedAccountID = null;
           loggedAction = null;
           logNotes = null;
    }

    public Log(Integer logID, Integer loggedAccountID, Integer loggedAction, String logNotes) {
        this.logID = logID;
        this.loggedAccountID = loggedAccountID;
        this.loggedAction = loggedAction;
        this.logNotes = logNotes;
    }

    public Integer getLogID() {
        return logID;
    }

    public void setLogID(Integer logID) {
        this.logID = logID;
    }

    public Integer getLoggedAccountID() {
        return loggedAccountID;
    }

    public void setLoggedAccountID(Integer loggedAccountID) {
        this.loggedAccountID = loggedAccountID;
    }

    public Integer getLoggedAction() {
        return loggedAction;
    }

    public void setLoggedAction(Integer loggedAction) {
        this.loggedAction = loggedAction;
    }

    public String getLogNotes() {
        return logNotes;
    }

    public void setLogNotes(String logNotes) {
        this.logNotes = logNotes;
    }
    
    
    
}
