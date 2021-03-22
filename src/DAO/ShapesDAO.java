/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.util.ArrayList;
import models.Circle;
import models.Ellipse;
import models.Line;
import models.Rectangle;
import models.Square;

/**
 *
 * @author juanf
 */
public class ShapesDAO {
    ArrayList <Line> lines;
    ArrayList <Circle> circles;
    ArrayList <Rectangle> rectangles;
    ArrayList <Square> squares;
    ArrayList <Ellipse> ellipses;

    public ShapesDAO() {
       lines = new ArrayList();
       circles = new ArrayList();
       rectangles = new ArrayList();
       squares = new ArrayList();
       ellipses = new ArrayList();
    }
    
   public void addShape(Circle circle)
   {
       circles.add(circle);
   }
   
   public void addShape(Line line)
   {
       lines.add(line);
   }
   public void addShape(Rectangle rectangle)
   {
       rectangles.add(rectangle);
   }
   public void addShape(Square square)
   {
       squares.add(square);
   }
   public void addShape(Ellipse ellipse)
   {
       ellipses.add(ellipse);
   }

    public ArrayList<Line> getLines() {
        return lines;
    }
    

    public ArrayList<Circle> getCircles() {
        return circles;
    }
    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }
    public ArrayList<Square> getSquares() {
        return squares;
    }
    public ArrayList<Ellipse> getEllipses() {
        return ellipses;
    }
   
}
