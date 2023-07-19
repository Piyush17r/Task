package com.entity;

import java.util.Date;

public class Employee {
    private String name;
    private String contact;
    private String gender;
    private Date dob;
    private String address;
    private String email;
    private String password;

    public Employee() {
    }

    public Employee(String name, String contact, String gender, Date dob, String address, String email, String password) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     @Override
     public String toString() {
         return "RegistrationEntity [name=" + name + ", contact=" + contact + ", gender=" + gender + ", dob=" + dob
                 + ", address=" + address + ", email=" + email + ", password=" + password + "]";
     }
}
