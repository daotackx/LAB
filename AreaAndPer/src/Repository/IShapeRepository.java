/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author THAO LINH
 */
public interface IShapeRepository {
    Triangle inputTriangle();
    Rectangle inputRectangle();
    Circle inputCircle();
    void display(Triangle trigle, Rectangle rectangle, Circle circle);
}
