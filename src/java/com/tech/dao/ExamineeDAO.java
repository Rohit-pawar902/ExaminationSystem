/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.dao;

/**
 *
 * @author DELL
 */
import com.tech.entities.Examinee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ExamineeDAO {
    private Connection con;

    public ExamineeDAO(Connection con) {
        this.con = con;
    }
     public Boolean saveUser(Examinee user) {

        Boolean f = false;
        try {

            String q = "insert into examinee(name ,email,password,gender,mobile,teachingField,stupassword) values(?,?,?,?,?,?,?)";
            PreparedStatement psmt = this.con.prepareStatement(q);
            psmt.setString(1, user.getName());
            psmt.setString(2, user.getEmail());
            psmt.setString(3, user.getPassword());
            psmt.setString(4, user.getGender());
            psmt.setString(5, user.getMobile());
            psmt.setString(6,user.getField());
            psmt.setString(7,user.getCourseAccessPass());
            psmt.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }
     
     public  Examinee getUserByEmailAndPass(String email, String pass) {
         Examinee user = null;
        try {
            String Query = "select * from examinee where email=? and password=? ";
            PreparedStatement psmt = con.prepareStatement(Query);
            psmt.setString(1, email);
            psmt.setString(2, pass);

            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                user = new Examinee();
                user.setId(rs.getInt("eid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setPassword(rs.getString("password"));
                user.setCourseAccessPass(rs.getString("stupassword"));
                user.setField(rs.getString("teachingField"));
                user.setRdate(rs.getTimestamp("RegistrationDate").toString());
                user.setGender(rs.getString("gender"));
                 user.setProfile(rs.getString("profile"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
     public  Examinee getExamineeByID(int eid) {
         Examinee user = null;
        try {
            String Query = "select * from examinee where eid=? ";
            PreparedStatement psmt = con.prepareStatement(Query);
            psmt.setInt(1,eid);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                user = new Examinee();
                user.setId(rs.getInt("eid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setPassword(rs.getString("password"));
                user.setCourseAccessPass(rs.getString("stupassword"));
                user.setField(rs.getString("teachingField"));
                user.setRdate(rs.getTimestamp("RegistrationDate").toString());
                user.setGender(rs.getString("gender"));
                 user.setProfile(rs.getString("profile"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
     public  ArrayList<Examinee> showDetail() {
         ArrayList<Examinee> arr=new ArrayList<Examinee>();
        try {
            String Query = "select * from examinee";
            PreparedStatement psmt = con.prepareStatement(Query);
            
            ResultSet rs = psmt.executeQuery();
            while(rs.next()) {
                Examinee user= new Examinee();
                user.setId(rs.getInt("eid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setPassword(rs.getString("password"));
                user.setCourseAccessPass(rs.getString("stupassword"));
                user.setField(rs.getString("teachingField"));
                user.setRdate(rs.getTimestamp("RegistrationDate").toString());
                user.setGender(rs.getString("gender"));
                 user.setProfile(rs.getString("profile"));
                arr.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
     public Boolean updateUser(Examinee u) {
        Boolean f=false;
        try {
            String q="update examinee set name=?,email=?,password=?,gender=?,mobile=?,profile=?,stupassword=? where eid=? ";
      PreparedStatement psmt=con.prepareStatement(q);
      psmt.setString(1,u.getName());
      psmt.setString(2,u.getEmail());
      psmt.setString(3,u.getPassword());
      psmt.setString(4,u.getGender());
      psmt.setString(5,u.getMobile());
      psmt.setString(6,u.getProfile());
       psmt.setString(7,u.getCourseAccessPass());
      psmt.setInt(8,u.getId());
     
      
        psmt.executeUpdate();
        f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f; 
    }
}
