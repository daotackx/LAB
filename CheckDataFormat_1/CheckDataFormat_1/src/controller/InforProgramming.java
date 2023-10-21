/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repo.InforRepo;
import view.Menu;

/**
 *
 * @author Nguyen Quang Hau
 */
public class InforProgramming extends Menu<String>{
    private InforRepo inforRepo;

    public InforProgramming() {
        super("Validate Program", new String[]{"Input Information.","Exit."});
        inforRepo = new InforRepo();
    }
    
    @Override
    public void excute(int n) {
        switch (n) {
            case 1 -> inforRepo.getInformation();
        }
    }
    
}
