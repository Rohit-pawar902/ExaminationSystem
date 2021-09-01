/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.dao;

import com.tech.entities.Feedback;
import com.tech.entities.MockTest;
import com.tech.entities.Question;
import com.tech.entities.Result;
import com.tech.entities.Student;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author DELL
 */
public class ExaminationDAO {

    private Connection con;

    public ExaminationDAO(Connection con) {
        this.con = con;
    }

    public Boolean saveMockTest(MockTest m) {
        Boolean flag = false;
        try {
            String q = "insert into atest(name,description,timelimit,no_question) values(?,?,?,?)";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setString(1, m.getTitle());
            ps.setString(2, m.getDesc());
            ps.setInt(3, m.getTimeLimit());
            ps.setInt(4, m.getNoQuestion());
            ps.executeUpdate();
            flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public ArrayList<MockTest> showAllTest() {
        ArrayList<MockTest> arr = new ArrayList<MockTest>();
        try {
            String q = "select * from atest";
            PreparedStatement ps = this.con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MockTest m = new MockTest();
                m.setId(rs.getInt("id"));
                m.setDesc(rs.getString("description"));
                m.setTitle(rs.getString("name"));
                m.setNoQuestion(rs.getInt("no_question"));
                m.setTimeLimit(rs.getInt("timeLimit"));
                m.setcDate(rs.getString("createdDate"));
                arr.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public MockTest showTestByTid(int tid) {
        MockTest m = new MockTest();
        try {
            String q = "select * from atest where id=?";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, tid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                m.setId(rs.getInt("id"));
                m.setDesc(rs.getString("description"));
                m.setTitle(rs.getString("name"));
                m.setNoQuestion(rs.getInt("no_question"));
                m.setTimeLimit(rs.getInt("timeLimit"));
                m.setcDate(rs.getString("createdDate"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }

    public boolean saveQuestion(Question m) {
        Boolean f = false;
        try {
            String q = "insert into aquestion(que,ch1,ch2,ch3,ch4,ans,tid) values(?,?,?,?,?,?,?)";
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
            String q = "select * from aquestion where tid=? ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, tid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Question m = new Question();
                m.setId(rs.getInt("qid"));
                m.setQue(rs.getString("que"));
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
            String q = "delete from aquestion where qid=? ";
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
            String q = "delete from atest where id=? ";
            String q1 = "delete from aquestion where tid=? ";
            PreparedStatement ps1 = this.con.prepareStatement(q1);
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

    public boolean saveResult(Result rs) {
        boolean f = false;
        try {
            String q = "insert into aResult(stuid,testid,rightAns,wrongAns,attemptedQue,totalQue) Values(?,?,?,?,?,?) ";
            PreparedStatement ps = this.con.prepareStatement(q);
            ps.setInt(1, rs.getStuid());
            ps.setInt(2, rs.getTid());
            ps.setInt(3, rs.getRightAns());
            ps.setInt(4, rs.getWrongAns());
            ps.setInt(5, rs.getQuestionAttempted());
            ps.setInt(6, rs.getTotalQue());
            ps.executeUpdate();
            f = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static class Pair {

        public Result key;
        public Student data;

        Pair(Result key, Student data) {
            this.key = key;
            this.data = data;
        }
    }

    public ArrayList<Pair> getAllResult() {
        ArrayList<Pair> arr = new ArrayList<>();
        try {
            String q = "Select * from aresult";
            PreparedStatement ps = this.con.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Result r = new Result();

                r.setRid(rs.getInt("id"));
                r.setStuid(rs.getInt("stuid"));
                r.setTid(rs.getInt("testid"));
                r.setRightAns(rs.getInt("rightAns"));
                r.setWrongAns(rs.getInt("wrongAns"));
                r.setTotalQue(rs.getInt("totalQue"));
                r.setQuestionAttempted(rs.getInt("attemptedQue"));
                int sid = rs.getInt("stuid");
                StudentDAO dao = new StudentDAO(this.con);
                Student m = dao.getStuByID(sid);
                Pair p = new Pair(r, m);
                arr.add(p);
            }
            return arr;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    /**
     *
     * @return
     */
    public HashMap<Integer,ArrayList<Result>> getResultbyStuID(int sid) {
        HashMap<Integer, ArrayList<Result>> hs = new HashMap<>();
         
        try {
            String q = "Select * from aresult where stuid=?";
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
    
    
    public Boolean submitFeedback(Feedback f){
        Boolean m=false;
    try{
        String q="insert into feedback(uname,uemail,umsg,ucity) Values(?,?,?,?)";
       PreparedStatement ps= con.prepareStatement(q);
       ps.setString(1,f.getName());
       ps.setString(2,f.getEmail());
       ps.setString(3,f.getMsg());
       ps.setString(4,f.getCity());
       ps.executeUpdate();
       m=true;
    }
    catch(SQLException e){
      e.printStackTrace();
    }
    return m;
    }
}
