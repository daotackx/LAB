/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import dao.InforDao;
import model.Information;

/**
 *
 * @author Nguyen Quang Hau
 */
public class InforRepo implements IInforRepo {

    private Information infor;

    public InforRepo() {
        infor = new Information();
    }

    @Override
    public void inputPhone() {
        infor.setPhone(InforDao.getInstance().getPhone());
    }

    @Override
    public void inputEmail() {
        infor.setEmail(InforDao.getInstance().getEmail());
    }

    @Override
    public void inputDate() {
        infor.setDate(InforDao.getInstance().getDate());
    }

    public void getInformation() {
        inputPhone();
        inputEmail();
        inputDate();
        display();
    }

    @Override
    public void display() {
        System.out.println("\n----DISPLAY----");
        System.out.println("Phone :" + infor.getPhone());
        System.out.println("Email :" + infor.getEmail());
        System.out.println("Date :" + infor.displayDate());
    }

}
