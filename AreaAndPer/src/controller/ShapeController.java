/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IShapeRepository;
import Repository.ShapeRepository;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class ShapeController extends Menu<String> {

    private IShapeRepository shapeRepository;
    static String mc[] = {"Calcalator Shape", "Exit"};

    public ShapeController() {
        super("Calculation", mc);
        shapeRepository = new ShapeRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->  {
                Rectangle rectangle = shapeRepository.inputRectangle();
                Circle circle = shapeRepository.inputCircle();
                Triangle triangle = shapeRepository.inputTriangle();
                shapeRepository.display(triangle, rectangle, circle);
            }
            case 2 -> System.exit(0);
        }
    }
}
