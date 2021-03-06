package com.example.ovidiu.easyworkers;

import android.location.Address;

import java.util.Date;

/**
 * Created by Ovidiu on 30/11/2017.
 */

public class Employee {
    private int id;
    private String first_name;
    private String surname;
    private Date birthday;
    private String address;
    private String phone_no;
    private String email;
    private int status;

    public Employee(int id, String first_name, String surname, Date birthday, String address, String phone_no, String email, int status) {
        this.id = id;
        this.first_name = first_name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
        this.status = status;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
