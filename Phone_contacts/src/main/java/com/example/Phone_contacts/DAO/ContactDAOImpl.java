package com.example.Phone_contacts.DAO;

import com.example.Phone_contacts.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("contactDAO")
public class ContactDAOImpl implements ContactDAO{

    private static final List<Contact> contactBook = new ArrayList<>();
    @Override
    public void add(Contact contact) {
        contactBook.add(contact);
    }

    @Override
    public void delete(Contact contact) {
        contactBook.remove(contact);
    }

    @Override
    public void edit(Contact contact) {
        contactBook.remove(contact);
        contactBook.add(contact);
    }

    @Override
    public String getContacts() {
        return contactBook.toString();
    }
}
