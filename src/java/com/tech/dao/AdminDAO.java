/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.dao;

import com.tech.entities.Admin;
import com.tech.entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class AdminDAO {
    private Connection con;

    public AdminDAO(Connection con) {
        this.con = con;
    }
    
    public Admin getUserByEmailAndPass(String email, String pass) {
        Admin user = null;
        try {
            String Query = "select * from Admin where email=? and password=? ";
            PreparedStatement psmt = con.prepareStatement(Query);
            psmt.setString(1, email);
            psmt.setString(2, pass);

            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                user = new Admin();
                user.setId(rs.getInt("aid"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email")); 
                user.setPassword(rs.getString("password"));
                user.setRdate(rs.getTimestamp("RegistertionDate").toString());
                user.setProfile(rs.getString("profile"));
                user.setGender(rs.getString("gender"));
                user.setField(rs.getString("field"));
                user.setMobile(rs.getString("mobile"));
            
            }   
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public Boolean updateUser(Admin u) {
        Boolean f=false;
        try {
            String q="update admin set name=?,email=?,password=?,gender=?,mobile=?,profile=? where aid=? ";
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
            System.out.println(e);
            e.printStackTrace();
        }
        return f; 
    }
    
}
