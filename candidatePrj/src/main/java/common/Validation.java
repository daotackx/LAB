/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;
import java.util.regex.Pattern;

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
                if (result < n || result > m) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number between " + n + " and " + m + "!");
            }
        }
    }

    public static int checkBirthDate(String mess) {
        int result;
        String check;
        while (true) {
            try {
                System.out.println(mess + ": ");
                result = Integer.parseInt(sc.nextLine());
                check = result + "";
                if (!Pattern.matches("^(1900|19[1-9][0-9]|20[0-1][0-9]|202[0-3])$", check)) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number with length is 4 character ! ");
            }
        }

    }

    public static String inputPhoneNumber(String mess) {
        String result;
        char[] c;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine();
            c = result.toCharArray();
            if (c.length == 10) {
                return result;
            }
            System.out.println("Please, enter a number with minimum 10 characters! ");
        }
    }

    public static String inputYN(String mess) {
        String result;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine().trim();
            if (result.equalsIgnoreCase("y") || result.equalsIgnoreCase("n")) {
                return result;
            }
            System.out.println("Please, enter again (Y/N) ");
        }
    }

    public static int getInt(String mess) {
        int result;
        while (true) {
            System.out.println(mess + ": ");
            try {
                result = Integer.parseInt(sc.nextLine());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number(>0)");
            }
        }
    }

    public static String getString(String mess) {
        String result;
        System.out.println(mess + ": ");
        result = sc.nextLine();
        while (result.isEmpty()) {
            System.out.println("Enter again(Can not blank)");
            result = sc.nextLine();
        }
        return result;
    }

    public static String inputEmail(String mess) {
        String pattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String result;
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine();
            if (Pattern.matches(pattern, result) && !result.isEmpty()) {
                return result;
            } else {
                System.out.println("Please, enter email with format <account name>@<domain>. ! ");
            }
        }
    }

    public static int checkExpYear(String mess) {
        int result;
        while (true) {
            try {
                System.out.println(mess + ": ");
                result = Integer.parseInt(sc.nextLine());
                if (result < 0 || result > 100) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a number from 0 to 100! ");
            }
        }
    }

    public static String checkRankGraduation(String mess) {
        String result = "";
        while (true) {
            System.out.println(mess + ": ");
            result = sc.nextLine();
            if ("Excellence".equalsIgnoreCase(result) || "Good".equalsIgnoreCase(result) || "Fair".equalsIgnoreCase(result) || "Poor".equalsIgnoreCase(result)) {
                break;
            }
        }

        return result;
    }

}
