/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GarbageTruck;
import repository.CollectingGarbageRepository;
import repository.ICollectingGarbageRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class Manager extends Menu<String> {
    private ICollectingGarbageRepository garbageRepository;
    static String[] options = {"Input", "Print", "Exit"};
    GarbageTruck g;

    public Manager() {
        super("===== COLLECTING GARBAGE MANAGEMENT =====", options);
        garbageRepository = new CollectingGarbageRepository();
        g = new GarbageTruck();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                garbageRepository.getInput(g);
            case 2:
                garbageRepository.printTheCost(g);
            case 3:
                System.exit(0);
        }
    }
}
