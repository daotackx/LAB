/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import controller.Counter;
import model.Element;

/**
 *
 * @author THAO LINH
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setS(library.getString("Enter your content"));
        Counter s = new Counter(element);
        s.run();
    }
}
