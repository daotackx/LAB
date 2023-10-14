/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import repository.IPersonRepository;
import repository.PersonRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class PersonController extends Menu<String>{
     private final IPersonRepository personRepository;
    static String[] op = {"Find person info", "Copy Text to new file", "Exit"};
    public PersonController() {
        super("File Processing", op);
        personRepository = new PersonRepository();
    }

    @Override
    public void execute(int n){
        switch (n) {
            case 1: {
                personRepository.findPersonInfo();
                break;
            }
            case 2: {
                personRepository.coppyNewFile();
                break;
            }
            case 3:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
}
