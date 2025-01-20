package com.example.portfolio.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class contactModel {
    private long id;
    private String name;
    private String email;
    private String company;
    private String phone;
    private String message;
}

