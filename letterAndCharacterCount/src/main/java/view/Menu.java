/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import java.util.ArrayList;

/**
 *
 * @author THAO LINH
 * @param <T>
 */
public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> opsList;
    Library l = new Library();
     public Menu(String title, String[] mc) {
        this.title = title;
        this.opsList = new ArrayList<>();
        for (String s : mc) {
            opsList.add((T) s);
        }
    }
    
    public void display(){
        System.out.println("--------------------------------");
        System.out.println(title);
        System.out.println("---------------------------------");
        for (int i = 0; i < opsList.size(); i++) {
            System.out.println((i+1) + "." + opsList.get(i));
        }
        System.out.println("----------------------------------");
    }
     
    public int getSelected(){
        display();
        return l.getInt("Enter selection ",1, opsList.size()+1);
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
