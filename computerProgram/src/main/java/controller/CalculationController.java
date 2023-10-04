/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.BMI;
import model.Element;
import model.Element.Operator;
import repository.CalculationRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class CalculationController extends Menu<String> {
    
    static String calList[] = {"Normal Calculator", "BMI Calculator", "Exit"};
    CalculationRepository calculationRepository;
    double num1;
    double num2;
    Operator op;
    double weight;
    double height;
    public CalculationController(Element element, BMI bmi){
        super("Calculator Program",calList);
        calculationRepository = new CalculationRepository();
        element.setNum1(num1);
        element.setNum2(num2);
        bmi.setWeight(weight);
        bmi.setHeight(height);
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:{
                System.out.println("Result: " + calculationRepository.calculate(num1, op, num2));
                break;
            }
            case 2:{
                System.out.println("BMI Status: " + calculationRepository.calculateBMI(weight, height));
                break;
            }
            case 3:
                System.exit(0);
        }
    }
    
    
}
