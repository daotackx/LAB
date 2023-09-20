/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THAO LINH
 * @param <T>
 */
public abstract class Menu<T> {
    protected String title;
     protected ArrayList<T> opsList;

    public Menu() {
    }

    public Menu(String td, String[] mc) {
        this.title = td;
        this.opsList = new ArrayList<>();
        for (String s : mc) {
            opsList.add((T) s);
        }
    }
    
    public void display(){
        System.out.println(title);
        System.out.println("---------------------------------");
        for (int i = 0; i < opsList.size(); i++) {
            System.out.println((i+1) + "." + opsList.get(i));
        }
        System.out.println("----------------------------------");
    }
     
    public int getSelected(){
        display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selection..");
        return Integer.parseInt(sc.nextLine());
    }
    
    public abstract void execute(int n);
    
    public void run(){
        while(true){
            int n = getSelected();
            execute(n);
            if(n> opsList.size()){
                break;
            }
        }
    }
}
