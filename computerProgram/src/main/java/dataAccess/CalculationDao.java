/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import model.BMI;
import model.BMI.BMIStatus;
import model.Element.Operator;
import static model.Element.Operator.ADD;

/**
 *
 * @author THAO LINH
 */
public class CalculationDao {

    private static CalculationDao instance = null;

    public static CalculationDao Instance() {
        if (instance == null) {
            synchronized (CalculationDao.class) {
                if (instance == null) {
                    instance = new CalculationDao();
                }
            }
        }
        return instance;
    }

    public double calculate(double a, Operator operator, double b) {
        double result = 0;
        a = Validation.getInputDouble("Enter number");
        while (true) {
            operator = Validation.getOperator("Enter operator");
            switch (operator) {
                case ADD: {
                    b = Validation.getInputDouble("Enter number");
                    result = a + b;
                    break;
                }
                case SUBTRACT: {
                    b = Validation.getInputDouble("Enter number");
                    result = a - b;
                    break;
                }
                case MULTIPLY: {
                    b = Validation.getInputDouble("Enter number");
                    result = a * b;
                    break;
                }
                case DIVIDE: {
                    try {
                        b = Validation.getInputDouble("Enter number");
                        result = a / b;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case POWER: {
                    b = Validation.getInputDouble("Enter number");
                    result = Math.pow(a, b);
                    break;
                }
                case EQUAL: {
                    return result;
                }
                default:
            }
            a = result;

        }
    }

    public BMIStatus calculateBMI(double weight, double height) {
        weight = Validation.getInputWeightHeight("Enter weight(kg)");
        height = Validation.getInputWeightHeight("Enter height(cm)");
        double bmi = (weight * 1000) / (height * height);
        System.out.println("BMI Number: " + bmi);
        if (bmi < 19) {
            return BMIStatus.UnderStandard;
        } else if (bmi >= 19 && bmi < 25) {
            return BMIStatus.Standard;
        } else if (bmi >= 25 && bmi < 30) {
            return BMIStatus.Overweight;
        } else if (bmi >= 30 && bmi < 40) {
            return BMIStatus.Fat;
        } else {
            return BMIStatus.VeryFat;
        }
    }
}
