/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.WorkerDao;
import java.util.ArrayList;
import model.History;
import model.Worker;

/**
 *
 * @author THAO LINH
 */
public class WorkerRepository implements IWorkerRepository{
    
    
    @Override
    public ArrayList<Worker> addWorker() {
        return WorkerDao.Instance().addWorker();
    }

    @Override
    public void displayInfomationSalary(ArrayList<History> hList) {
        WorkerDao.Instance().displayInfomationSalary(hList);
    }

    @Override
    public void changeSalary(ArrayList<History> hList, int n) {
        if(WorkerDao.Instance().changeSalary(hList, n)){
            System.out.println("Change succesfully");
        }else{
            System.out.println("Change failed");
        }
    }
    
}
