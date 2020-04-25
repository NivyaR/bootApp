package com.poshley.app.Entities;

import com.poshley.app.Components.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class UserEntity {

    @Autowired public App app;

    private int id;
    private String userName;
    private int phoneNumber;
    private String dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserEntity(int id, String userName, int phoneNumber, String dateOfBirth) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
