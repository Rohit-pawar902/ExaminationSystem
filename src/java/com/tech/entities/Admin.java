/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.entities;

/**
 *
 * @author DELL
 */
public class Admin {
    private int id;
    private String name;
    private String email;
    private String password; 
    private String gender;
    private String mobile;
    private String field;
    private String rdate;
    private String profile;

    public Admin() {
    }

    public Admin(int id, String name, String email, String password, String gender, String mobile, String field, String rdate, String profile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.mobile = mobile;
        this.field = field;
        this.rdate = rdate;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", mobile=" + mobile + ", field=" + field + ", rdate=" + rdate + ", profile=" + profile + '}';
    }

    
    
}
