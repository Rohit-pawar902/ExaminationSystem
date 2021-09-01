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
public class ExamineeMockTest {
    private int etid;
    private String name;
    private String password;
    private String description;
    private int noQuestion;
    private int timeLimit;
    private String date;
    private int catid;
    private int eid;


    public ExamineeMockTest() {
    }

    public ExamineeMockTest(int etid, String name, String password, String description, int noQuestion, int timeLimit, String date, int catid, int eid) {
        this.etid = etid;
        this.name = name;
        this.password = password;
        this.description = description;
        this.noQuestion = noQuestion;
        this.timeLimit = timeLimit;
        this.date = date;
        this.catid = catid;
        this.eid = eid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
 
    public int getEtid() {
        return etid;
    }

    public void setEtid(int etid) {
        this.etid = etid;
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

    public int getNoQuestion() {
        return noQuestion;
    }

    public void setNoQuestion(int noQuestion) {
        this.noQuestion = noQuestion;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "ExamineeMockTest{" + "etid=" + etid + ", name=" + name + ", password=" + password + ", noQuestion=" + noQuestion + ", timeLimit=" + timeLimit + ", catid=" + catid + ", eid=" + eid + '}';
    }
    
    
    
}
