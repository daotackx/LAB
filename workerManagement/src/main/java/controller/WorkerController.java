/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import model.History;
import repository.IWorkerRepository;
import repository.WorkerRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class WorkerController extends Menu<String> {
    private final IWorkerRepository workerRepository;
    static String[] op = {"Add Worker", "Up salary", "Down salary", "Display Information salary", "Exit"};
    ArrayList<History> hList;
    public WorkerController() {
        super("Worker Management ", op);
        workerRepository = new WorkerRepository();
        hList = new  ArrayList<>();
    }

    @Override
    public void execute(int n){
        switch (n) {
            case 1: {
                workerRepository.addWorker();
                break;
            }
            case 2: {
                workerRepository.changeSalary(hList, 1);
                break;
            }
            case 3: {
                workerRepository.changeSalary(hList, 2);
                break;
            }
            case 4: {
                workerRepository.displayInfomationSalary(hList);
                break;
            }
            case 5:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
}
