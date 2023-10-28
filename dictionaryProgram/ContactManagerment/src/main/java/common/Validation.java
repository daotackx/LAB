/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import model.Contact;

/**
 *
 * @author THAO LINH
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";

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
    
    public static String getInputString(String mess){
        String result;
        while(true){
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            if(!result.isEmpty()){
                return result;
            }
            System.out.println("Please, enter again(not empty)");
        }
    }
    
    public static String getFullName(String mess){
         String result;
        while(true){
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            
            if(!result.isEmpty() && result.contains(" ")){
                return result;
            }
            System.out.println("Please, enter again(not empty)");
        }
    }

    public static String getPhoneNum(String mess){
        String result;
        while(true){
            System.out.println(mess + ": ");
            result = sc.nextLine();
            if(!result.isEmpty() && Pattern.matches(VALID_PHONE, result) ){
                return result;
            }
            System.out.println("Please, enter phone flow"
            + "\n+ 1234567890"
            + "\n+ 123-456-7890"
            + "\n+ 123-456-7890 x1234"
            + "\n+ 123-456-7890 ext1234"
            + "\n+ (123)-456-7890"
            + "\n+ 123.456.7890"
            + "\n+ 123 456 7890");
        }
    }
    
    public static boolean checkIdExist(ArrayList<Contact> contact, int id){
        for (Contact o : contact) {
            if(id == o.getId()){
                return true;
            }
        }
        return false;
    }
    
    public static int getInt(String mess){
        int result;
        while(true){
            System.out.println(mess + ": ");
            try {
               result = Integer.parseInt(sc.nextLine()); 
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("ID is digit(>0)");
            }
        }
    }
}
