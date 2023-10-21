/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import common.Validation;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nguyen Quang Hau
 */
public class InforDao {

    private static InforDao instance;
    private Scanner sc = new Scanner(System.in);

    public static InforDao getInstance() {
        if (instance == null) {
            synchronized (InforDao.class) {
                if (instance == null) {
                    instance = new InforDao();
                }
            }
        }
        return instance;
    }

    public String getPhone() {
        while (true) {
            try {
                System.out.print("Phone number: ");
                String phone = sc.nextLine();
                new Validation().checkPhone(phone);
                return phone;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getEmail() {
        while (true) {
            try {
                System.out.print("Email: ");
                String email = sc.nextLine();
                new Validation().checkEmail(email);
                return email;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Date getDate() {
        while (true) {
            try {
                System.out.print("Date: ");
                String dateStr = sc.nextLine();
                Date date = new Validation().checkDate(dateStr);
                return date;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
