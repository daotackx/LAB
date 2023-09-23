/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Arrays;
import java.util.Random;
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

    public int[] createArray(int size) {
        int[] arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public void display(int arr[]) {
            System.out.println(Arrays.toString(arr));
    }
}
