/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Program;
import Model.Element;

/**
 *
 * @author THAO LINH
 */
public class Main {

    public static void main(String[] args) {
        Element element = new Element();
        Program p = new Program(element);
        p.run();
    }
}
