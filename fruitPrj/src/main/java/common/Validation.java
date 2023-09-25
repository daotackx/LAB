/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Fruit;
import model.Order;

/**
 *
 * @author THAO LINH
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public int getIntLimit(String mess, int n, int m) {
        int result;
        System.out.println(mess + ": ");
        while (true) {
            try {

                result = Integer.parseInt(sc.nextLine().trim());
                if (result < n || result > m) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + " and " + m + "!");
            }
        }
    }

    public int getInputInt(String mess) {
        int result;
        System.out.println(mess + ": ");
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number(>0)!");
            }
        }

    }

    public double getInputDouble(String mess) {
        double result;
        System.out.println(mess + ": ");
        while (true) {
            try {
                result = Double.parseDouble(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number(>0): ");
            }
        }
    }

    public String getInputString(String mess) {
        String s;
        System.out.println(mess + ": ");
        s = sc.nextLine().trim();
        while (s.isEmpty()) {
            System.out.println("Enter again(Can not blank): ");
            s = sc.nextLine().trim();
        }
        return s;
    }

    public boolean checkFruitExist(ArrayList<Fruit> fList, Fruit f) {
        for (Fruit o : fList) {
            if (f.getFruitName().equalsIgnoreCase(o.getFruitName())
                    && f.getPrice() == o.getPrice()
                    && f.getOrigin().equalsIgnoreCase(o.getOrigin())) {
                System.out.println("Fruit has exist!");
                return false;
            }
        }
        return true;
    }

    public boolean checkIdExist(ArrayList<Fruit> fList, int id) {
        for (Fruit o : fList) {
            if (o.getFruitId() == id) {
                System.out.println("Id has exist!");
                return false;
            }
        }
        return true;
    }
    
    public boolean checkOrderExist(ArrayList<Order> oList, int id){
        for (Order o : oList) {
            if(o.getFruitId() == id){
                return false;
            }
        }
        return true;
    }

    public boolean checkYN() {
        String s;
        while (true) {
            s = getInputString("Do you want to continue(Y/N)?");
            if ((s.equalsIgnoreCase("Y"))) {
                return true;

            } else if ((s.equalsIgnoreCase("N"))) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

}
