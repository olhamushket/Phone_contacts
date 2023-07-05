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

    public static List<String> getEmails() {
        return emails;
    }

    public static List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' + emails + '\'' + phoneNumbers + '\'' +
                '}';
    }
}
