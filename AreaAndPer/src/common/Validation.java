/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author THAO LINH
 */
public class Validation {
    static Scanner sc = new Scanner(System.in);
    public int getIntLimit(String mess, int n, int m) {
        int result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < n || result > m) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + " and " + m);
            }
        }
    }
    
    public double getInputDouble(String mess) {
        double result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Double.parseDouble(sc.nextLine());
                if(result <= 0){
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, re-input(>0)");
            }
        }
    }
    
    public boolean checkTriangle(double a, double b, double c){
        if(a + b > c && b + c > a && a + c > b){
            return true;
        }else{
            return false;
        }
    }
}
