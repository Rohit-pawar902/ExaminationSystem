/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.servlet;

import com.tech.dao.ExamineeExaminationDAO;
import com.tech.entities.Question;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@MultipartConfig
public class EAddQuestionServ extends HttpServlet {

     protected void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException, IOException{
      PrintWriter out=res.getWriter();
      Question m=new Question();
      m.setQue(request.getParameter("question"));
      m.setCh1(request.getParameter("choice_A"));
      m.setCh2(request.getParameter("choice_B"));
      m.setCh3(request.getParameter("choice_C"));
      m.setCh4(request.getParameter("choice_D"));
      m.setTid(Integer.parseInt(request.getParameter("tid").trim()));
      m.setAns(request.getParameter("correctAnswer"));
      
      ExamineeExaminationDAO dao=new ExamineeExaminationDAO(ConnectionProvider.getConnection());
      boolean f=dao.saveQuestion(m);
      if(f){
          out.print("done");
      }
      else{
           out.print("not done");
      }
  }
     
}
