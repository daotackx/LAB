/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import model.Worker;

/**
 *
 * @author THAO LINH
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static int getIntLimit(String mess, int n, int m) {
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

    public static String getInputId(String mess, ArrayList<Worker> wList) {
        String result;
        while (true) {
            result = getString(mess);
            if (Pattern.matches("^[W|w]\\d{1,}$", result)) {
                if (!wList.isEmpty()) {
                    for (Worker o : wList) {
                        if (result.equalsIgnoreCase(o.getId())) {
                            System.out.println("Id has existed");
                            break;
                        } else {
                            return result;
                        }
                    }
                } else {
                    return result;
                }
            }else{
                System.out.println("Please, enter again(W123)");
            }
            
        }
    }

    public static String getString(String mess) {
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

    public static double getInputDouble(String mess) {
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

    public static boolean checkIdExist(ArrayList<Worker> wList, String code) {
        if (wList.isEmpty()) {
            System.out.println("List is empty!");
            return false;
        }
        for (Worker worker : wList) {
            if(code.equalsIgnoreCase(worker.getId())) {
                return true;
            }
        }
        return false;
    }

    public static String getStatus(int n) {
        String result = "";
        switch (n) {
            case 1:
                result = "Up";
                break;
            case 2:
                result = "Down";
                break;
            default:
        }
        return result;
    }
}
