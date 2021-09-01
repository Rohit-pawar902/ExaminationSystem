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
public class MockTest {
    private int id;
    private String title;
    private String desc;
    private int timeLimit;
    private int noQuestion;
    private String cDate;

    public MockTest(int id, String title, String desc, int timeLimit, int noQuestion, String cDate) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.timeLimit = timeLimit;
        this.noQuestion = noQuestion;
        this.cDate = cDate;
    }

    public MockTest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getNoQuestion() {
        return noQuestion;
    }

    public void setNoQuestion(int noQuestion) {
        this.noQuestion = noQuestion;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    @Override
    public String toString() {
        return "MockTest{" + "id=" + id + ", title=" + title + ", desc=" + desc + ", timeLimit=" + timeLimit + ", noQuestion=" + noQuestion + ", cDate=" + cDate + '}';
    }

     
    
    
}
