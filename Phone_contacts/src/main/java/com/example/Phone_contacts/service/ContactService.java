package com.example.Phone_contacts.service;

import com.example.Phone_contacts.DAO.ContactDAO;
import com.example.Phone_contacts.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactDAO contactDAO;

    @Autowired
    public ContactService(@Qualifier("contactDAO") ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    public void addContact(Contact contact){
        contactDAO.add(contact);
    }
}
