/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.ElementRepository;
import repository.IElementRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class Program extends Menu<String> {
    private IElementRepository elementRepository;
    static String[] op = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};

    public Program() {
        super("Equation Program Menu", op);
        elementRepository = new ElementRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                float a=0,b=0;
                System.out.println("Calculate Equation");
                elementRepository.calculateEquation(a, b);
                break;
            }
            case 2: {
                float a=0,b=0,c=0;
                System.out.println("Calculate Quadratic Equation");
                elementRepository.calculateQuadraticEquation(a,b,c);
                break;
            }
            case 3:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
}
