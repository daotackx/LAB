/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Library;
import common.Validation;
import java.util.ArrayList;
import java.util.Collections;
import model.History;
import model.Worker;

/**
 *
 * @author THAO LINH
 */
public class WorkerDao {

    private static WorkerDao instance = null;

    public static WorkerDao Instance() {
        if (instance == null) {
            synchronized (WorkerDao.class) {
                if (instance == null) {
                    instance = new WorkerDao();
                }
            }
        }
        return instance;
    }
    Library l = new Library();

    ArrayList<Worker> wList = new ArrayList<>();
    ArrayList<History> hList = new ArrayList<>();
    Validation va = new Validation();

    public ArrayList<Worker> addWorker() {
        System.out.println("======== Worker Management =========");
        String id = va.getInputId("Enter Code", wList);
        String name = va.getString("Enter name");
        int age = va.getIntLimit("Enter age", 18, 50);
        double salary = va.getInputDouble("Enter salary");
        String workLocation = va.getString("Enter work location");
        Worker worker = new Worker(id, name, age, salary, workLocation);
        wList.add(worker);
        return wList;
    }

    public boolean changeSalary(ArrayList<History> hList, int n) {
        System.out.println("------- Up/Down Salary --------");
        String id = va.getString("Enter code");
        if (!va.checkIdExist(wList, id)) {
            return false;
        }
        Worker w = getWorkerByCode(wList, id);
        double newSalary;
        String status = va.getStatus(n);
        double amount = va.getInputDouble("Enter salary");
        if (status.equalsIgnoreCase("Up")) {
            newSalary = w.getSalary() + amount;
            w.setSalary(newSalary);
        } else {
            newSalary = w.getSalary() - amount;
            w.setSalary(newSalary);
        }

        String date = l.getCurrentDate();
        History h = new History(status, date, w.getId(), w.getName(), w.getAge(), w.getSalary(), w.getWorkLocation());
        hList.add(h);
        return true;
    }

    public void displayInfomationSalary(ArrayList<History> hList) {
        System.out.println("--------------------Display Information Salary-----------------------");
        Collections.sort(hList);
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");
        for (History history : hList) {
            System.out.printf("%-5s%-15s%-5d%-10.2f%-10s%-20s\n", history.getId(),
                    history.getName(), history.getAge(), history.getSalary(),
                    history.getStatus(), history.getDate());
        }
    }

    public Worker getWorkerByCode(ArrayList<Worker> wList, String code) {
        for (Worker worker : wList) {
            if (code.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }
}
