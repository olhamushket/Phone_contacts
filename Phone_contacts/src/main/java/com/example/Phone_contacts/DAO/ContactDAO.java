package com.example.Phone_contacts.DAO;

import com.example.Phone_contacts.model.Contact;

import java.util.List;

public interface ContactDAO {
    void add(Contact contact);

    void delete(Contact contact);

    void edit(Contact contact);

    String getContacts();
}
