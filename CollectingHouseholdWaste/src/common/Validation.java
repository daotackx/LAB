/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THAO LINH
 */
public class Validation {
    static Scanner sc = new Scanner(System.in);
    public int getIntLimit(String mess, int n, int m) {
        if(n > m){
            int temp = n;
            n = m;
            m = temp;
        }
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
    
    
    public String getString(String mes) {
        System.out.print(mes);
        return sc.nextLine();
    }
    
    public int getInt(String mes) {
        return Integer.parseInt(getString(mes));
    }
    
    public ArrayList<Integer> getIntArrayList() {
        ArrayList<Integer> garbages = new ArrayList<>();
        for (Integer garbage : garbages) 
            garbage = getInt("");
        return garbages;
    }
}
