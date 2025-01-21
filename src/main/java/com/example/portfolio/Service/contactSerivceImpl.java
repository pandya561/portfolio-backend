package com.example.portfolio.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.portfolio.Entity.contactEntity;
import com.example.portfolio.Model.contactModel;
import com.example.portfolio.Repostiry.contactRepostiry;

@Service
public class contactSerivceImpl implements contactSerivce {

    @Autowired
    contactRepostiry contactrepostiry;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public String createinquier(contactModel contactmodel) {
        // Save the inquiry to the database
        contactEntity contactentity = new contactEntity();
        BeanUtils.copyProperties(contactmodel, contactentity);
        contactrepostiry.save(contactentity);

        // Send a confirmation email
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(contactmodel.getEmail());
        message.setSubject("Thank you for contact");
        message.setText("Thank you for contact");
        mailSender.send(message);

        SimpleMailMessage message1 = new SimpleMailMessage();
        message1.setTo("pandyajay561@gmail.com");
        message1.setSubject("Thank you for contact");
        message1.setText("Thank you for contact" + " \n" +"Name:"+ contactmodel.getName() + " \n " + "Company:" + contactmodel.getCompany() + " \n" + "Phone:" + contactmodel.getPhone()+  " \n " +"Email:" + contactmodel.getEmail() +  " \n " +"Message:" + contactmodel.getMessage());
        mailSender.send(message1);

        return "Created successfully";
    }
}
