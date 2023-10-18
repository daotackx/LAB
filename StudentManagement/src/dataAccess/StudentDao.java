/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.SortByName;
import model.Student;

/**
 *
 * @author THAO LINH
 */
public class StudentDao {

    static StudentDao instance = null;

    public static StudentDao Instance() {
        if (instance == null) {
            synchronized (StudentDao.class) {
                if (instance == null) {
                    instance = new StudentDao();
                }
            }
        }
        return instance;
    }
    List<Student> sList = new ArrayList<>();
    Validation va  = new Validation();

    public List<Student> sortStudent() {
        System.out.println("====== Collection Sort Program ======");
        while (true) {
            String name = va.getString("Name");
            String clasS = va.getString("Classes");
            double mark = va.getInputDouble("Mark");
            Student s = new Student(name, clasS, mark);
            sList.add(s);
            if (!va.checkYN("Do you want to enter more student information?(Y/N)")) {
                break;
            }
        }
        Collections.sort(sList, new SortByName());
        return sList;
    }
    
    public void display(){
        for (int i = 0; i < sList.size(); i++) {
            System.out.println("-------------Student " + (i + 1) + "-------------"); 
            System.out.println(sList.get(i).toString());
        }
    }
}
