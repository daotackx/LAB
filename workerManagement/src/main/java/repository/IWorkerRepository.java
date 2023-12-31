/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.History;
import model.Worker;

/**
 *
 * @author THAO LINH
 */
public interface IWorkerRepository {
    ArrayList<Worker> addWorker();
    void displayInfomationSalary(ArrayList<History> hList);
    void changeSalary(ArrayList<History> hList, int n);
}
