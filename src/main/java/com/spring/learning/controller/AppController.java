package com.spring.learning.controller;

import com.spring.learning.builder.Contact;
import com.spring.learning.builder.ContactBuilder;
import com.spring.learning.factory.Pet;
import com.spring.learning.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {

  @Autowired
  PetFactory petFactory;

  @GetMapping
  public String getDefault() {
    return "{\"message\": \"Hello World 123\"}";
  }

  @PostMapping("adoptPet/{type}/{name}")
  public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
    Pet adoptedPet = petFactory.adoptPet(type, name);
    adoptedPet.feed();
    return adoptedPet;
  }

  @GetMapping("presidents")
  public List<Contact> getPresidentContacts() {
    List<Contact> contacts = new ArrayList<>();

    // traditional way
    Contact contact = new Contact();
    contact.setFirstName("George");
    contact.setLastName("Washington");
    contact.setEmailAddress("George.Washington@myapp.com");
    contacts.add(contact);

    // Constructor way
    contacts.add(new Contact("Abraham", "Lincon", null));

    // Builder way
    contacts.add(new ContactBuilder().setFirstName("Jhon.F").setLastName("Kennedy").setEmailAddress("jfk@application.com").build());

    return contacts;
  }
}
