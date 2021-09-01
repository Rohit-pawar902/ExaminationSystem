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
public class Question {
    private int id;
    private int tid;
    private String que;
    private String ch1;
    private String ch2;
    private String ch3;
    private String ch4;
    private String ans;

    public Question(int id, int tid, String que, String ch1, String ch2, String ch3, String ch4, String ans) {
        this.id = id;
        this.tid = tid;
        this.que = que;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
        this.ch4 = ch4;
        this.ans = ans;
    }

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", tid=" + tid + ", que=" + que + ", ch1=" + ch1 + ", ch2=" + ch2 + ", ch3=" + ch3 + ", ch4=" + ch4 + ", ans=" + ans + '}';
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getCh1() {
        return ch1;
    }

    public void setCh1(String ch1) {
        this.ch1 = ch1;
    }

    public String getCh2() {
        return ch2;
    }

    public void setCh2(String ch2) {
        this.ch2 = ch2;
    }

    public String getCh3() {
        return ch3;
    }

    public void setCh3(String ch3) {
        this.ch3 = ch3;
    }

    public String getCh4() {
        return ch4;
    }

    public void setCh4(String ch4) {
        this.ch4 = ch4;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

   
    
}
