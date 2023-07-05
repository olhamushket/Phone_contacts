package com.example.Phone_contacts.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private final String name;
    private static List<String> emails = new ArrayList<>();
    private static List<String> phoneNumbers = new ArrayList<>();

    public Contact(@JsonProperty("name") String name,
                   @JsonProperty("emails") List<String> emails,
                   @JsonProperty("phoneNumbers") List<String> phoneNumbers) {
        this.name = name;
        Contact.emails = emails;
        Contact.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "{" + '\n'+ '\t'+
                "name:" +'\"'+ name + '\"'+'\n' + '\t' + "emails:" + emails + '\n' + '\t' + "phoneNumbers:" + phoneNumbers + '\n' +
                '}';
    }
}
