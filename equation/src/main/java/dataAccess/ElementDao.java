/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THAO LINH
 */
public class ElementDao {

    private static ElementDao instance = null;

    public static ElementDao Instance() {
        if (instance == null) {
            synchronized (ElementDao.class) {
                if (instance == null) {
                    instance = new ElementDao();
                }
            }
        }
        return instance;
    }

    public List<Float> calculateEquation(float a, float b) {
        List<Float> number = new ArrayList<>();
        float x;
        a = Validation.getInputFloat("Enter A");
        b = Validation.getInputFloat("Enter B");
        if (a == 0) {
            if (b == 0) {

                System.out.println("Infinitely many solutions");
                number.add(a);
                number.add(b);
                print(number);
                return number;
            } else {
                System.out.println("No solutions");
                return null;
            }
        } else {
            x = -a / b;
            number.add(a);
            number.add(b);
            number.add(x);
            System.out.println("Solution: x= " + x);
            print(number);
            return number;
        }
    }

    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        List<Float> number = new ArrayList<>();
        float x1;
        float x2;
        double delta;
        float x;
        a = Validation.getInputFloat("Enter A");
        b = Validation.getInputFloat("Enter B");
        c = Validation.getInputFloat("Enter C");
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinitely many solutions");
                    number.add(a);
                    number.add(b);
                    number.add(c);
                    print(number);
                    return number;
                } else {
                    System.out.println("No solutions");
                    return null;
                }
            } else {
                x = -b / c;
                number.add(a);
                number.add(b);
                number.add(c);
                number.add(x);
                System.out.println("Solution: x= " + x);
                print(number);
                return number;
            }
        } else if (a != 0) {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                number.add(a);
                number.add(b);
                number.add(c);
                System.out.println("No solution");
                print(number);
                return number;
            } else if (delta == 0) {
                float result = -b / (2 * a);
                System.out.println("Solution x1=x2= " + result);
                number.add(a);
                number.add(b);
                number.add(c);
                number.add(result);
                print(number);
                return number;
            } else {
                x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                System.out.println("Solution x1 = " + x1 + " and x2 = " + x2);
                number.add(a);
                number.add(b);
                number.add(c);
                number.add(x1);
                number.add(x2);
                print(number);
                return number;
            }
        }
        return null;
    }

    public void print(List<Float> number) {
        System.out.print("Number is Odd: ");
        for (int i = 0; i < number.size(); i++) {
            if (Validation.checkOdd(number.get(i))) {
                System.out.print(number.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.print("Number is Even: ");
        for (int i = 0; i < number.size(); i++) {
            if (!Validation.checkOdd(number.get(i))) {
                System.out.print(number.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.print("Number is Perfect Square: ");
        for (int i = 0; i < number.size(); i++) {
            if (Validation.isPerfectSquare(number.get(i))) {
                System.out.print(number.get(i) + ", ");
            }
        }
        System.out.println();
    }
}
