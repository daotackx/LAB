/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validation;
import java.util.ArrayList;
import model.Fruit;
import model.Order;
import view.Menu;
import java.util.Hashtable;

/**
 *
 * @author THAO LINH
 */
public class FruitController extends Menu<String> {

    Hashtable<String, ArrayList<Order>> hs;
    ArrayList<Fruit> fList;
    Validation va  = new Validation();
    static String[] mList = {"Create Fruit", "View orders", "Shopping(for buyer)", "Exit"};

    public FruitController() {
        super("FRUIT MANAGERMENT", mList);
        fList = new ArrayList<>();
        hs = new Hashtable<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                createFruit();
                break;
            }
            case 2: {
                viewOrders(hs);
                break;
            }
            case 3: {
                shopping(fList, hs);
                break;
            }
            case 4: {
                System.exit(0);
            }
            default:
                System.out.println("Please, enter again!");
        }
    }

    public void createFruit() {
        while (true) {
            int fruitId;
            do {
                fruitId = va.getInputInt("Input Id");
            } while (!va.checkIdExist(fList, fruitId));
            String fruitName = va.getInputString("Input name");
            double price = va.getInputDouble("Input price");
            int quanlity = va.getInputInt("Input quanlity");
            String origin = va.getInputString("Input orgin");
            Fruit f = new Fruit(fruitId, fruitName, price, quanlity, origin);
            if (va.checkFruitExist(fList, f)) {
                fList.add(f);
                System.out.println("Add fruit successfully!");
            }
            if (!va.checkYN()) {
                return;
            }
        }
    }

    public void viewOrders(Hashtable<String, ArrayList<Order>> hs) {
        for (String o : hs.keySet()) {
            System.out.println("Customer: " + o);
            ArrayList<Order> oList = hs.get(o);
            displayOrder(oList);
        }
    }

    public void displayFruit(ArrayList<Fruit> fList) {
        int item = 0;
        System.out.printf("%10s%13s%10s%10s\n", "|++Item++|", "++FruitName++|", "++Origin++|", "++Price++|");
        for (Fruit o : fList) {
            if (o.getQuanlity() != 0) {
                item = item + 1;
                System.out.printf("%5d%13s%15s%10.0f$\n", item, o.getFruitName(), o.getOrigin(), o.getPrice());
            }

        }
    }

    public void shopping(ArrayList<Fruit> fList, Hashtable<String, ArrayList<Order>> hs) {
        if (fList.isEmpty()) {
            System.out.println("No item");
            return;
        }
        ArrayList<Order> oList = new ArrayList<>();
        while (true) {
            displayFruit(fList);
            int choice = va.getIntLimit("Input your selects item", 1, fList.size());
            int quanlity;
            Fruit fruit = getFruitByItem(fList, choice);
            quanlity = va.getIntLimit("Please, input quanlity", 1, fruit.getQuanlity());
            fruit.setQuanlity(fruit.getQuanlity() - quanlity);
            if (!va.checkOrderExist(oList, fruit.getFruitId())) {
                updateOrder(oList, fruit.getFruitId(), quanlity);
            } else {
                Order order = new Order(fruit.getFruitId(), fruit.getFruitName(), quanlity, fruit.getPrice());
                oList.add(order);
            }
            if (!va.checkYN()) {
                break;
            }
        }
        displayOrder(oList);
        String nameCustomer = va.getInputString("Input your name");
        hs.put(nameCustomer, oList);
    }

    public void updateOrder(ArrayList<Order> oList, int id, int quantity) {
        for (Order o : oList) {
            if (o.getFruitId() == (id)) {
                o.setQuantity(o.getQuantity() + quantity);
                return;
            }
        }
    }

    public Fruit getFruitByItem(ArrayList<Fruit> fList, int item) {
        int countItem = 0;
        for (Fruit o : fList) {
            if (o.getQuanlity() != 0) {
                countItem = countItem + 1;
            }
            if (countItem == item) {
                System.out.println("You selected: " + o.getFruitName());
                return o;
            }
        }
        return null;
    }

    public void displayOrder(ArrayList<Order> oList) {
        System.out.printf("%10s%13s%10s%10s\n", "|++Product++|", "++Quality++|", "++Price++|", "++Amount++|");
        double total = 0;
        for (Order o : oList) {
            double amount = o.getQuantity() * o.getPrice();
            System.out.printf("%10s%8d%10.0f$%10.0f$\n", o.getFruitName(), o.getQuantity(), o.getPrice(), amount);
            total = total + amount;
        }
        System.out.printf("Total: %.0f$\n",total);
    }
}
