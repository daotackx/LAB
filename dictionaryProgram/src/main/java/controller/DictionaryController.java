/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.DictonaryRepository;
import repository.IDictionaryRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class DictionaryController extends Menu<String> {
    
    static String[] mc = {"Add new word", "Delete word", "Search word", "Exit"};
    private final IDictionaryRepository dictionaryRepository;

    public DictionaryController() {
        super("DictionaryController", mc);
        dictionaryRepository = new DictonaryRepository();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                dictionaryRepository.addWord();
                break;
            }
            case 2: {
                dictionaryRepository.removeWord();
                break;
            }
            case 3: {
                dictionaryRepository.translate();
                break;
            }
            case 4:
                System.exit(0);
        }
    }
    
}
