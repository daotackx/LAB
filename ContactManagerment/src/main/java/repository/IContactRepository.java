/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Contact;

/**
 *
 * @author THAO LINH
 */
public interface IContactRepository {
    void addContact(ArrayList<Contact> contactList);
    void updateContact(Contact contact);

    void deleteContact(ArrayList<Contact> contactList);

    void searchContact(ArrayList<Contact> contactList);

    void getAllCandidates(ArrayList<Contact> contactList);

    Contact getCandidateById(int candidateId);
}
