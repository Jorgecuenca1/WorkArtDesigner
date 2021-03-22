/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Circle;
import models.Line;
import DAO.ShapesDAO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import models.Point;
import views.MainWindow;

/**
 *
 * @author juanf
 */
public class MarkerController {

    ShapesDAO shapes;
    MainWindow mainwindow;
    BufferedImage image;

    public MarkerController() {
        shapes = new ShapesDAO();
        /*   shapes.addShape(new Circle(50,new Point(400,400),Color.red));
       Line line=new Line(new Point(500,500),new Point(700,700),Color.green);
       shapes.addShape(line);*/
        image = null;

        mainwindow = new MainWindow(shapes, image);
        mainwindow.setPanel(image, shapes);
    }

    public void start() {
        mainwindow.setVisible(true);
    }
}
