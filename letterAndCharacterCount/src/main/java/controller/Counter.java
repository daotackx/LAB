/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class Counter extends Menu<String>{
    protected Library library;
    protected Algorithm algorithm;
    protected String s;
    static String[] opsList = {"Count Letter", "Count Character","Exit"};

    public Counter(Element element) {
        super("Search Menu", opsList);
        library = new Library();
        algorithm = new Algorithm();
        s = element.getS();
    }
    
  
@Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                algorithm.countLetter(s);
                        break;
            }
            case 2:{
               algorithm.countCharacter(s);
                        break;
            }
            case 3:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
}
