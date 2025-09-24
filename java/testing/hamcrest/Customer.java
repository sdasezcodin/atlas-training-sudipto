package com.atlas;

public class Customer {
    private String fname; // fields should be private
    private String lname;

    public Customer(String fname, String lname) {
        this.fname = fname;  // fixed assignment
        this.lname = lname;
    }

    // Getters needed for Hamcrest bean property matcher
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
