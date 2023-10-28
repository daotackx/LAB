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

    public String getString(String mess) {
        String result;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            }
            System.out.println("Please, enter again(Can not blank)");
        }
    }

    public double getInputDouble(String mess) {
        double result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Double.parseDouble(sc.nextLine());
                if (result < 0 || result > 100) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number(>0)");
            }
        }
    }

    public boolean checkYN(String mess) {
        String result;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
