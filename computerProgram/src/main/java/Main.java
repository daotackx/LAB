
import controller.CalculationController;
import model.BMI;
import model.Element;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THAO LINH
 */
public class Main {
    public static void main(String[] args) {
        Element element = new Element();
        BMI bmi = new BMI();
        CalculationController calculationController = new CalculationController(element, bmi);
        calculationController.run();
    }
}
