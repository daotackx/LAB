/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;
import model.Element.Operator;

/**
 *
 * @author THAO LINH
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static int getIntLimit(String mess, int m, int n) {
        int result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < m || result > n) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + m + " and " + n);
            }
        }
    }

    public static double getInputDouble(String mess) {
        double result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number");
            }
        }
    }

    public static double getInputWeightHeight(String mess) {
        double result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Double.parseDouble(sc.nextLine());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number(>0)");
            }
        }
    }

    public static Operator getOperator(String mess) {
        String result;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            if (result.isEmpty()){
                System.out.println("Please, enter (+, -, *, /, ^)");
            }else{
                for (Operator op : Operator.values()) {
                    if(op.getSymbol().equals(result)){
                        return op;
                    }
                }
            }
            System.out.println("Please, enter (+, -, *, /, ^)");
        }
    }
}
