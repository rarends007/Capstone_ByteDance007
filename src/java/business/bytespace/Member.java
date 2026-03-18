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
public class Member extends User implements Serializable{
    private HashMap<Integer, User> friends;

    public Member() {
        friends = null;
    }

    public Member(HashMap<Integer, User> friends) {
        this.friends = friends;
    }

    public HashMap<Integer, User> getFriends() {
        return friends;
    }

    public void setFriends(HashMap<Integer, User> friends) {
        this.friends = friends;
    }
    
    
    
    
}
