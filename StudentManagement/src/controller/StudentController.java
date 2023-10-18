/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.IStudentRepository;
import repository.StudentRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class StudentController extends Menu<String> {

    private IStudentRepository studentRepository;
    static String[] mc = {"Sort Student", "Display", "Exit"};

    public StudentController() {
        super("Student Information", mc);
        studentRepository = new StudentRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                studentRepository.sortStudent();
                break;
            }
            case 2: {
                studentRepository.display();
                break;
            }
            case 3:
                System.exit(0);
            default:
        }
    }
}
