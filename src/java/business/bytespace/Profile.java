/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.bytespace;

import business.bytespace.Super.User;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author raren
 */
public class Profile implements Serializable {
    private Integer profileUserID;
    private HashMap<Integer, User> friends;
    private  String profileStatus;
    //May need more fields later too as we go.
    
    public Profile(){
        profileUserID = null;
        friends = null;
        profileStatus = null;
    }

    public Profile(Integer profileUserID, HashMap<Integer, User> friends, String profileStatus) {
        this.profileUserID = profileUserID;
        this.friends = friends;
        this.profileStatus = profileStatus;
    }

    public Integer getProfileUserID() {
        return profileUserID;
    }

    public void setProfileUserID(Integer profileUserID) {
        this.profileUserID = profileUserID;
    }

    public HashMap<Integer, User> getFriends() {
        return friends;
    }

    public void setFriends(HashMap<Integer, User> friends) {
        this.friends = friends;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }
    
    
}
