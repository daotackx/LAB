/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Contact;
import repository.ContactRepository;
import repository.IContactRepository;
import view.Menu;

/**
 *
 * @author THAO LINH
 */
public class ContactController extends Menu<String>{
    private IContactRepository contactRepository;
    ArrayList<Contact> contactList;
    static String[] conMenu = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
    public ContactController(){
        super("Contact program", conMenu);
        contactRepository = new ContactRepository();
        contactList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                contactRepository.addContact(contactList);
                break;
            case 2:
                contactRepository.getAllCandidates(contactList);
                break;
            case 3:
                contactRepository.deleteContact(contactList);
                break;
            case 4:
                System.exit(0);
            default:
        }
    }
    
    
}
