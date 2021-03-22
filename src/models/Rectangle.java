/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Color;

/**
 *
 * @author Jorge
 */
public class Rectangle extends Shape{
    
    int width;
    int height;

    public Rectangle(int width, int height, Point start, Color color) {
        super(start, color);
        
        this.width = width;
        this.height = height;
    }

    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    

    

    
    
}
