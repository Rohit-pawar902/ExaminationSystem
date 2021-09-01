/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.dao;

import com.tech.entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class StudentDAO {

    private Connection con;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    public Boolean saveUser(Student user) {

        Boolean f = false;
        try {

            String q = "insert into student(name ,email,password,gender,mobile,EducationField) values(?,?,?,?,?,?)";
            PreparedStatement psmt = this.con.prepareStatement(q);
            psmt.setString(1, user.getName());
            psmt.setString(2, user.getEmail());
            psmt.setString(3, user.getPassword());
            psmt.setString(4, user.getGender());
            psmt.setString(5, user.getMobile());
            psmt.setString(6,user.getField());
            psmt.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }
   //get user by Email and Password

    public Student getUserByEmailAndPass(String email, String pass) {
        Student user = null;
        try {
            String Query = "select * from student where email=? and password=? ";
            PreparedStatement psmt = con.prepareStatement(Query);
            psmt.setString(1, email);
            psmt.setString(2, pass);

            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                user = new Student();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setMobile(rs.getString(4));
                user.setPassword(rs.getString(5));
                user.setField(rs.getString(6));
                user.setRdate(rs.getTimestamp(7).toString());
                user.setGender(rs.getString(8));
                 user.setProfile(rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
     public Boolean updateUser(Student u) {
        Boolean f=false;
        try {
            String q="update student set name=?,email=?,password=?,gender=?,mobile=?,profile=? where stuid=? ";
      PreparedStatement psmt=con.prepareStatement(q);
      psmt.setString(1,u.getName());
      psmt.setString(2,u.getEmail());
      psmt.setString(3,u.getPassword());
      psmt.setString(4,u.getGender());
      psmt.setString(5,u.getMobile());
      psmt.setString(6,u.getProfile());
      psmt.setInt(7,u.getId());
      
        psmt.executeUpdate();
        f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f; 
    }
   public  ArrayList<Student> showDetail(){
        ArrayList<Student> list=new ArrayList<Student>();
       try{
           String q="select *from student";
            PreparedStatement psmt=con.prepareStatement(q);
            ResultSet rs=psmt.executeQuery();
           
            while(rs.next()){
                 Student u=new Student();
                u.setId(rs.getInt("stuid"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setGender(rs.getString("gender"));
                u.setField(rs.getString("EducationField"));
                u.setMobile(rs.getString("mobile"));
                u.setPassword(rs.getString("password"));
                u.setProfile(rs.getString("profile"));
                u.setRdate(rs.getString("RegitrationDate").toString());
                list.add(u);
            }
            return list;
       }
       catch(Exception e){
          e.printStackTrace();
       }
       return list;
   
   }
   public Student getStuByID(int sid){
       Student u=null;
       try{
           String q="select *from student where stuid=?";
            PreparedStatement psmt=con.prepareStatement(q);
            psmt.setInt(1,sid);
            ResultSet rs=psmt.executeQuery();
           
            if(rs.next()){
                 u=new Student();
                u.setId(rs.getInt("stuid"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setGender(rs.getString("gender"));
                u.setField(rs.getString("EducationField"));
                u.setMobile(rs.getString("mobile"));
                u.setPassword(rs.getString("password"));
                u.setProfile(rs.getString("profile"));
                u.setRdate(rs.getString("RegitrationDate").toString());
                
            }
            return u;
       }
       catch(Exception e){
          e.printStackTrace();
       }
       return u;
   
   }
}
