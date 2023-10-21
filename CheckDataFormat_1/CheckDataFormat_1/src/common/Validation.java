/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Validation {

    private Scanner sc;

    public Validation() {
        sc = new Scanner(System.in);
    }

    public void checkPhone(String phone) throws Exception {
        if (phone.matches("[0-9]{1,}")) {
            if (phone.length() != 10) {
                throw new Exception("Phone number must be 10 digits");
            }
        } else {
            throw new Exception("Phone number must be number");
        }
    }

    public void checkEmail(String email) throws Exception {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new Exception("Email must be correct format");
        }
    }

    public Date checkDate(String dateStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        if (!dateStr.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            throw new Exception("Date to correct format (dd/MM/yyyy)");
        }
        
        try {
            Date date = sdf.parse(dateStr);
            return date;
        } catch (Exception e) {
            throw new Exception("The date is invalid");
        }
    }

    public int getIntData(String msg, int minValue, int maxValue) {
        int data = 0;

        if (minValue > maxValue) {
            int temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }

        while (true) {
            try {
                System.out.print(msg);
                data = sc.nextInt();
                if (data >= minValue && data <= maxValue) {
                    break;
                } else {
                    System.out.println("Input number have to be between " + minValue + " to " + maxValue);
                }
            } catch (Exception e) {
                System.out.println("The integer number format is invalid\n");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return data;
    }

}
