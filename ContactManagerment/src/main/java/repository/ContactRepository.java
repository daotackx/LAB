/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.ContactDao;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author THAO LINH
 */
public class ContactRepository implements IContactRepository{
    
    private ArrayList<Contact> contactList;
    
    public ContactRepository(){
        contactList = new ArrayList<>();
    }

    @Override
    public void addContact(ArrayList<Contact> contactList) {
        ContactDao.Instance().addContact(contactList);
    }

    @Override
    public void updateContact(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteContact(ArrayList<Contact> contactList) {
        ContactDao.Instance().deleteContract(contactList);
    }

    @Override
    public void searchContact(ArrayList<Contact> contactList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getAllCandidates(ArrayList<Contact> contactList) {
        ContactDao.Instance().displayAllContacts(contactList);
    }

    @Override
    public Contact getCandidateById(int candidateId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
