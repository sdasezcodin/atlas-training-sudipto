package com.atlas;

import java.util.Date;

public class User02 {
    private Long id;
    private String name;
    private Date registrationDate;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
