/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.bytespace;

import java.awt.image.BufferedImage; //https://stackoverflow.com/questions/14353302/displaying-image-in-java
import java.io.Serializable;


/**
 *
 * @author raren
 */
public class Image implements Serializable {
    private Integer imageID;
    private String imagePath;

    public Image() {
        imageID = null;
        imagePath = null;
    }

    public Image(Integer imageID, String imagePath) {
        this.imagePath = imagePath;
        this.imageID = imageID;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    
    
    
    
}
