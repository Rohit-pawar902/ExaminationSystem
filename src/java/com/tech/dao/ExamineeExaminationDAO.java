/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.dao;

import com.tech.entities.Examinee;
import com.tech.entities.ExamineeMockTest;
import com.tech.entities.Question;
import com.tech.entities.Result;
import com.tech.entities.TestCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ExamineeExaminationDAO {

    private Connection con;

    public ExamineeExaminationDAO(Connection con) {
        this.con = con;
    }

    public ArrayList<TestCategory> getAllCategory() {
        ArrayList<TestCategory> arr = new ArrayList<>();
        try {
            String q = "Select * from category";
            PreparedStatement ps = this.con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TestCategory c1 = new TestCategory();
                c1.setId(Integer.parseInt(rs.getString("id")));
                c1.setCatName(rs.getString("catname"));
                c1.setDesc(rs.getString("description"));
                arr.add(c1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExamineeExaminationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;

    }

    public boolean saveMockTest(ExamineeMockTest m) {
        Boolean flag = false;
        try {
            String q = "insert into ExamineeTest(testName,password,description,timeLimit,noQuestion,catid,examineeid) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setString(1, m.getName());
            ps.setString(2, m.getPassword());
            ps.setString(3, m.getDescription());
            ps.setInt(4, m.getTimeLimit());
            ps.setInt(5, m.getNoQuestion());
            ps.setInt(6, m.getCatid());
            ps.setInt(7, m.getEid());

            ps.executeUpdate();
            flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public ArrayList<ExamineeMockTest> showExamineeTest(int id) {
        ArrayList<ExamineeMockTest> arr = new ArrayList<>();
        try {
            String q = "select * from examineetest where examineeid=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ExamineeMockTest m = new ExamineeMockTest();
                m.setEtid(rs.getInt("id"));
                m.setCatid(rs.getInt("catid"));
                m.setName(rs.getString("testName"));
                m.setDescription(rs.getString("description"));
                m.setPassword(rs.getString("password"));
                m.setNoQuestion(rs.getInt("noQuestion"));
                m.setTimeLimit(rs.getInt("timeLimit"));
                m.setDate(rs.getString("date"));
                arr.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public boolean saveQuestion(Question m) {
        boolean f = false;
        try {
            String q = "insert into examineeque(Question,ch1,ch2,ch3,ch4,ans,etid) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setString(1, m.getQue());
            ps.setString(2, m.getCh1());
            ps.setString(3, m.getCh2());
            ps.setString(4, m.getCh3());
            ps.setString(5, m.getCh4());
            ps.setString(6, m.getAns());
            ps.setInt(7, m.getTid());
            ps.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public ArrayList<Question> getQuestions(int tid) {
        ArrayList<Question> arr = new ArrayList<>();
        try {
            String q = "select * from examineeque where etid=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, tid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Question m = new Question();
                m.setId(rs.getInt("id"));
                m.setQue(rs.getString("Question"));
                m.setCh1(rs.getString("ch1"));
                m.setCh2(rs.getString("ch2"));
                m.setCh3(rs.getString("ch3"));
                m.setCh4(rs.getString("ch4"));
                m.setAns(rs.getString("ans"));
                arr.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public boolean DeleteQuestions(int id) {
        boolean f = false;
        try {
            String q = "delete from examineeque where id=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public boolean deleteTest(int tid) {
        boolean f = false;
        try {
            String q2="delete from eresult where testid=? ";
            String q = "delete from examineetest where id=? ";
            String q1 = "delete from examineeque where etid=? ";
            PreparedStatement ps1 = this.con.prepareStatement(q1);
            ps1.setInt(1, tid);
            ps1.executeUpdate();
            ps1 = this.con.prepareStatement(q2);
            ps1.setInt(1, tid);
            ps1.executeUpdate();
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, tid);
            ps.executeUpdate();

            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public int authenticateStuToExamineeTest(String eName, String ePass) {
        int eid=-1;
        try {
            String q = "select * from examinee where name=? and stupassword=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setString(1, eName);
            ps.setString(2, ePass);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                eid=Integer.parseInt(rs.getString("eid"));
            }
         return eid;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eid;
    }
    
    public ArrayList<ExamineeMockTest> showAllTest(int eid){
        ArrayList<ExamineeMockTest> arr=new ArrayList<>();
        try{
            String q = "select *from examineetest where examineeid=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, eid);
            
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                ExamineeMockTest m = new ExamineeMockTest();
                m.setEtid(rs.getInt("id"));
                m.setCatid(rs.getInt("catid"));
                m.setName(rs.getString("testName"));
                m.setDescription(rs.getString("description"));
                m.setPassword(rs.getString("password"));
                m.setNoQuestion(rs.getInt("noQuestion"));
                m.setTimeLimit(rs.getInt("timeLimit"));
                m.setDate(rs.getString("date"));
                arr.add(m);
            }
            
            
        }catch(SQLException e){
             e.printStackTrace();
        }
        return arr;
    
    }
    
     public ExamineeMockTest showTestByTid(int tid) {
        ExamineeMockTest m = new ExamineeMockTest();
        try {
            String q = "select * from examineetest where id=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, tid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                m.setEtid(rs.getInt("id"));
                m.setDescription(rs.getString("description"));
                m.setName(rs.getString("testName"));
                m.setNoQuestion(rs.getInt("noQuestion"));
                m.setEid(rs.getInt("examineeid"));
                m.setCatid(rs.getInt("catid"));
                m.setTimeLimit(rs.getInt("timeLimit"));
                m.setDate(rs.getString("date"));
                m.setPassword(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }
     
     public boolean saveResult(Result rs,int eid) {
        boolean f = false;
        try {
            String q = "insert into EResult(stuid,testid,rightAns,wrongAns,attemptedQue,totalQue,eid) Values(?,?,?,?,?,?,?) ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, rs.getStuid());
            ps.setInt(2, rs.getTid());
            ps.setInt(3, rs.getRightAns());
            ps.setInt(4, rs.getWrongAns());
            ps.setInt(5, rs.getQuestionAttempted());
            ps.setInt(6, rs.getTotalQue());
            ps.setInt(7, eid);
            ps.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }
     public HashMap<Integer,ArrayList<Result>> getResultbyStuID(int sid) {
        HashMap<Integer, ArrayList<Result>> hs = new HashMap<>();
         
        try {
            String q = "Select * from eresult where stuid=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, sid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Result r = new Result();
                int testid=rs.getInt("testid");
                r.setTid(rs.getInt("testid"));
                    r.setRid(rs.getInt("id"));
                    r.setStuid(rs.getInt("stuid"));
                    r.setRightAns(rs.getInt("rightAns"));
                    r.setWrongAns(rs.getInt("wrongAns"));
                    r.setTotalQue(rs.getInt("totalQue"));
                    r.setQuestionAttempted(rs.getInt("attemptedQue"));
                    r.setEid(rs.getInt("eid"));
                   ArrayList<Result> arr = hs.getOrDefault(testid,new ArrayList<>());
                   arr.add(r);
                   System.out.println(arr);
                   hs.put(testid,arr);
            }
            return hs;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hs;
    }
    
     public HashMap<Integer,HashMap<Integer,ArrayList<Result>>> getResultbyExamineeID(int eid) {
        HashMap<Integer,HashMap<Integer,ArrayList<Result>>> hs = new HashMap<>();
         
        try {
            String q = "Select * from eresult where eid=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, eid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Result r = new Result();
                int testid=rs.getInt("testid");
                int stuid=rs.getInt("stuid");
                r.setTid(rs.getInt("testid"));
                    r.setRid(rs.getInt("id"));
                    r.setStuid(rs.getInt("stuid"));
                    r.setRightAns(rs.getInt("rightAns"));
                    r.setWrongAns(rs.getInt("wrongAns"));
                    r.setTotalQue(rs.getInt("totalQue"));
                    r.setQuestionAttempted(rs.getInt("attemptedQue"));
                    r.setEid(rs.getInt("eid"));
                    HashMap<Integer,ArrayList<Result>> arr = hs.getOrDefault(testid,new HashMap<>());
                    ArrayList<Result> arr1=arr.getOrDefault(stuid,new ArrayList<>());
                    arr1.add(r);
                    arr.put(stuid, arr1);
                   hs.put(testid,arr);
            }
            return hs;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hs;
    }
}
