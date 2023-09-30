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

    public static int getIntLimit(String mess, int n, int m) {
        int result;
        System.out.println(mess + ": ");
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine().trim());
                if (result < n && result > m) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + " and " + m);
            }
        }
    }

    public static float getInputFloat(String mess) {
        float result;
        System.out.println(mess + ": ");
        while (true) {
            try {
                result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a real number");
            }
        }
    }

    public static boolean checkOdd(float n) {
        return n % 2 != 0;
    }

    public static boolean isPerfectSquare(float n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}
