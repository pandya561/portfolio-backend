package com.example.portfolio.Conttroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.Model.contactModel;
import com.example.portfolio.Service.contactSerivce;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("http://localhost:5173")
public class contactCottorler {
    @Autowired
    contactSerivce contactserivce;

    @PostMapping("contact")
    public String crateinquier(@RequestBody contactModel contactmodel) {
        return contactserivce.createinquier(contactmodel);
    }
}
