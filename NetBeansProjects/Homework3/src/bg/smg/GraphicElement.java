/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author A
 */
public class GraphicElement implements Comparable<GraphicElement>{
     private String img;
     private int size;

     public GraphicElement(String name, int size) {
        this.img = name;
        this.size = size;
     }
     
     @Override
     public int compareTo(GraphicElement o) {
        if(getSize()>o.getSize()){
            return 1;
        }
        else if(this.getSize()==o.getSize()){
            return 0;
        }
        else {

            return -1; 
        } 
        
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    

}
