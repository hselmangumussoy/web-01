package com.hsgumussoy.web01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id// herhangi bir veri eklendiğinde o id nin tek (unic) olduğundan emin olmak.
    @GeneratedValue(strategy = GenerationType.AUTO)// otomatik olarak generate ediyor.
    private int userId;
    private String userName;
    private String fullName;
    private String birthDay;
    private String email;
    private String password;

    public User() {
    }

    public User(int userId, String userName, String fullName, String birthDay, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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
}
