/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author THAO LINH
 */
public class Library {
    private final static Scanner sc = new Scanner(System.in);
    
   

    public int getInt(String st, int n, int m) {
        int result = -1;
        while (true) {
            try {
                System.out.println(st + ": ");
                String value = sc.nextLine();
                result = Integer.parseInt(value);
                if (result >= n && result <= m) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + "and " + m);
            }
        }
        return result;
    }
    
     public String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (Pattern.matches("^[0-1]+$", result)) {
                return result;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (Pattern.matches("^[0-9]+$", result)) {
                return result;
            }
            System.err.println("Must be enter 0-9");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (Pattern.matches("^[0-9A-F]+$", result)) {
                return result;
            }
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }
    

}
