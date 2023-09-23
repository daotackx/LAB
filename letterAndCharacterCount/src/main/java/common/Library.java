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
public class Library {
    public int getInt(String st, int n, int m) {
        int result = -1;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(st+": ");
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
    
    public String getString(String st) {
        System.out.print(st+ ": ");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        while(s.isEmpty()){
            System.out.print("Please, enter a string(Can not blank): ");
            s = sc.nextLine();
        }
        return s;
    }
    
}
