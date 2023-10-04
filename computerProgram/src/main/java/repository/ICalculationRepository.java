/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.BMI;
import model.Element;

/**
 *
 * @author THAO LINH
 */
public interface ICalculationRepository {
    double calculate(double a, Element.Operator operator, double b);
    BMI.BMIStatus calculateBMI(double weight, double height);
}
