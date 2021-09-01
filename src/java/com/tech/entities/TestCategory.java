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
public class TestCategory {
    private int id;
    private String catName;
    private String desc;

    public TestCategory() {
    }

    public TestCategory(int id, String catName, String desc) {
        this.id = id;
        this.catName = catName;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestCategory{" + "id=" + id + ", catName=" + catName + ", desc=" + desc + '}';
    }
    
    
}
