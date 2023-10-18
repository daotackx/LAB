/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author THAO LINH
 */
public class ShapeDao {

    static ShapeDao instance = null;

    public static ShapeDao Instance() {
        if (instance == null) {
            synchronized (ShapeDao.class) {
                if (instance == null) {
                    instance = new ShapeDao();
                }
            }
        }
        return instance;
    }
    Validation va  = new Validation();

    public Triangle inputTriangle() {
        while (true) {
            double a = va.getInputDouble("Please input side A of Triangle");
            double b = va.getInputDouble("Please input side B of Triangle");
            double c = va.getInputDouble("Please input side C of Triangle");
            if (va.checkTriangle(a, b, c)) {
                Triangle t = new Triangle(a, b, c);
                return t;
            }
            System.out.println("Can not create a triangle");
            System.out.println("Please, re-input");
        }

    }

    public Rectangle inputRectangle() {
        double width = va.getInputDouble("Please input side width of Rectangle");
        double length = va.getInputDouble("Please input length of Rectangle");
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        double radius = va.getInputDouble("Please input radius of Circle");
        return new Circle(radius);
    }

    public void inputShape() {
        inputRectangle();
        inputCircle();
        inputTriangle();
    }
    
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }
}
