/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DAO.ShapesDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import models.Circle;
import models.Ellipse;
import models.Line;
import models.Rectangle;
import models.Square;

/**
 *
 * @author juanf
 */
public class DrawHelper {

    Graphics graphics;
    private BufferedImage image;

    public DrawHelper(Graphics graphics, BufferedImage image) {
        this.image = image;
        this.graphics = graphics;
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.drawImage(this.image, 0, 0, null);
        g2d.dispose();
    }

    public void draw(ShapesDAO shapes) {
        for (Circle circle : shapes.getCircles()) {
            graphics.setColor(circle.getColor());
            graphics.fillOval(circle.getStart().getX(), circle.getStart().getY(), circle.getRadius() * 2, circle.getRadius() * 2);
        }
        for (Line line : shapes.getLines()) {
            graphics.setColor(line.getColor());
            graphics.drawLine(line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY());
        }
        for (Rectangle rectangle : shapes.getRectangles()) {
         graphics.setColor(rectangle.getColor());
         graphics.fillRect(rectangle.getStart().getX(),rectangle.getStart().getY(), rectangle.getWidth(),rectangle.getHeight());
       } 
        for (Ellipse ellipse : shapes.getEllipses()) {
         graphics.setColor(ellipse.getColor());
         graphics.fillOval(ellipse.getWidth()/2,ellipse.getHeight()/2,ellipse.getStart().getX(),ellipse.getStart().getY());
       }
        for (Square square : shapes.getSquares()) {
         graphics.setColor(square.getColor());
         graphics.fillRect(square.getStart().getX(),square.getStart().getX(),square.getSide1(),square.getSide1());
       }
    }
}
