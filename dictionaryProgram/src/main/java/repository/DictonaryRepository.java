/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DictionaryDao;

/**
 *
 * @author THAO LINH
 */
public class DictonaryRepository implements IDictionaryRepository{

    @Override
    public void addWord() {
        if(DictionaryDao.Instance().addWord()){
            System.out.println("Successful");
        }else{
            System.out.println("Unsuccessful");
        }
    }

    @Override
    public void removeWord() {
        if(DictionaryDao.Instance().removeWord()){
            System.out.println("Successful");
        }else{
            System.out.println("Unsuccessful");
        }
    }

    @Override
    public void translate() {
        DictionaryDao.Instance().translate();
    }
    
}
