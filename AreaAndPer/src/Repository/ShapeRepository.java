/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import dataAccess.ShapeDao;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author THAO LINH
 */
public class ShapeRepository implements IShapeRepository{
    
    @Override
    public Triangle inputTriangle() {
        return ShapeDao.Instance().inputTriangle();
    }

    @Override
    public Rectangle inputRectangle() {
       return ShapeDao.Instance().inputRectangle();
    }

    @Override
    public Circle inputCircle() {
        return ShapeDao.Instance().inputCircle();
    }

    @Override
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        ShapeDao.Instance().display(trigle, rectangle, circle);
    }
}
