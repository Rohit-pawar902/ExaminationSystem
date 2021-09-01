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
public class Student {

    private int id;
    private String name;
    private String password;
    private String email;
    private String mobile;
    private String gender;
    private String field;
    private String rdate;
    private String profile;

    public Student() {
    }

    public Student(int id, String name, String password, String email, String mobile, String gender, String field, String rdate, String profile) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return "Student{" + "id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", field=" + field + ", rdate=" + rdate + ", profile=" + profile + '}';
    }

     

}
