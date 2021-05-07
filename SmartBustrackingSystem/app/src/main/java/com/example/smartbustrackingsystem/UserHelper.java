package com.example.smartbustrackingsystem;

public class UserHelper {
    public UserHelper() {

    }

    String name,parentname,number,address;

    public UserHelper(String name, String parentname, String number, String address) {
        this.name = name;
        this.parentname = parentname;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
