/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.Locale;

/**
 *
 * @author THAO LINH
 */
public interface ILogin {
    public int checkInputAccount(Locale language);
    String checkInputPassword(Locale language);
    boolean checkInputCaptcha(String captchaGenerated, Locale language);
}
