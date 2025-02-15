package com.sc.rp.data.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String emailName;
    private String phone;
    private String password;
    private String street;
    private String city;
    private String state;
    private String zip;
}
