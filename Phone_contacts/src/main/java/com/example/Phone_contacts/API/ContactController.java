package com.example.Phone_contacts.API;

import com.example.Phone_contacts.model.Contact;
import com.example.Phone_contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/contact")
@RestController
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public void addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
    }

    @DeleteMapping
    public void deleteContact(@RequestBody Contact contact){
        contactService.deleteContact(contact);
    }

    @PutMapping
    public void editContact(@RequestBody Contact contact){
        contactService.editContact(contact);
    }

    @GetMapping
    public String getContacts(){
        return contactService.getAllContacts();
    }
}
