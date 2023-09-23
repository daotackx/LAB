/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Common.Algorithm;
import Common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class Search extends Menu<String> {

    protected Library library;
    protected Algorithm algorithm;
    protected int arrSize;
    protected int[] arr;
    static String[] opsList = {"Linear Search", "Binary Search","Exit"};

    public Search(Element element) {
        super("Search Menu", opsList);
        library = new Library();
        algorithm = new Algorithm();
        arrSize = element.getSizeArray();
        arr = element.getArray();
    }
    
  
@Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                int value = library.getInt("Enter number ", 0, 100);
                        library.display(arr);
                        algorithm.linearSearch(arr, value);
                        break;
            }
            case 2:{
                int value = library.getInt("Enter number ", 0, 100);
                        algorithm.bubbleSort(arr);
                        library.display(arr);                       
                        algorithm.binarySearch(arr, value);
                        break;
            }
            case 3:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }


}
