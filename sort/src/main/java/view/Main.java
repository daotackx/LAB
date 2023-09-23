/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Common.Library;
import controller.Sort;
import model.Element;

/**
 *
 * @author THAO LINH
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
         Element element = new Element();
        element.setSizeArray(library.getInt("Enter number of array",1, 100));
        element.setArray(library.createArray(element.getSizeArray()));
        Sort sort = new Sort(element);
        sort.run();
    }
}
