/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.CalculationDao;
import model.BMI;
import model.Element;

/**
 *
 * @author THAO LINH
 */
public class CalculationRepository implements ICalculationRepository{
    

    @Override
    public double calculate(double a, Element.Operator operator, double b) {
        return CalculationDao.Instance().calculate(a, operator, b);
    }

    @Override
    public BMI.BMIStatus calculateBMI(double weight, double height) {
        return CalculationDao.Instance().calculateBMI(weight, height);
    }
    
}
