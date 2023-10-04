/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.Validation;
import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author THAO LINH
 */
public class ContactDao {

    private static ContactDao instance = null;

    public static ContactDao Instance() {
        if (instance == null) {
            synchronized (ContactDao.class) {
                if (instance == null) {
                    instance = new ContactDao();
                }
            }
        }
        return instance;
    }
    
    public int getId(ArrayList<Contact> contactList){
        if(contactList.isEmpty()){
            return 1;
        }
        Contact c = contactList.get(contactList.size()-1);
        int id = c.getId() + 1;
        return id;
    }

    public void addContact(ArrayList<Contact> contactList) {
        System.out.println("-------- Add a Contact --------");
        int Id = getId(contactList);
        String fullName = Validation.getFullName("Enter Full Name");
        String[] name = fullName.split(" ");
        String firstName = name[0];
        String lastName = name[1];
        String group = Validation.getInputString("Enter Group");
        String address = Validation.getInputString("Enter Address");
        String phone = Validation.getPhoneNum("Enter Phone");
        Contact contact = new Contact(Id, fullName, group, address, phone, lastName, firstName);
        contactList.add(contact);
    }

    public void displayAllContacts(ArrayList<Contact> contactList) {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%-5s%-15s%-15s%-15s%-10s%-15s%-10s\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact o : contactList) {
            System.out.printf("%-5d%-15s%-15s%-15s%-10s%-15s%-10s\n", o.getId(), o.getFullName(), o.getFirstName(), o.getLastName(), o.getGroup(), o.getAddress(), o.getPhone());
        }
    }

    public void deleteContract(ArrayList<Contact> contactList) {
        System.out.println("------- Delete a Contact -------");
        int idContact = Validation.getInt("Enter ID");
        if (Validation.checkIdExist(contactList, idContact)) {
            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getId() == idContact) {
                    contactList.remove(i);
                    System.out.println("Successful");
                }
            }
        } else {
            System.out.println("No found contact");
        }
    }

}
