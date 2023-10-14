/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.PersonDao;

/**
 *
 * @author THAO LINH
 */
public class PersonRepository implements IPersonRepository{

    @Override
    public void findPersonInfo() {
        PersonDao.Instance().findPersonInfo();
    }

    @Override
    public void coppyNewFile() {
        PersonDao.Instance().coppyNewFile();
    }
    
}
