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
public class Feedback {
    private int id;
    private String name;
    private String email;
    private String msg;
    private String city;

    public Feedback(int id, String name, String email, String msg, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.msg = msg;
        this.city = city;
    }

    public Feedback() {
    }

    @Override
    public String toString() {
        return "Feedback{" + "id=" + id + ", name=" + name + ", email=" + email + ", msg=" + msg + ", city=" + city + '}';
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
