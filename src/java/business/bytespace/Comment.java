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
public class Comment implements Serializable {
    private Integer commentID;
    private Integer commentingUserID;
    private Integer postID;
    private String commentText;

    public Comment() {
        commentID = null;
        commentingUserID = null;
        postID = null;
        commentText = null;
        
    }

    public Comment(Integer commentID, Integer commentingUserID, Integer postID, String commentText) {
        this.commentID = commentID;
        this.commentingUserID = commentingUserID;
        this.postID = postID;
        this.commentText = commentText;
    }

    public Integer getCommentID() {
        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
    }

    public Integer getCommentingUserID() {
        return commentingUserID;
    }

    public void setCommentingUserID(Integer commentingUserID) {
        this.commentingUserID = commentingUserID;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
    
    
    
    
}
