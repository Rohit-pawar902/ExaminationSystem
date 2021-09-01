/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tech.servlet;

import com.tech.dao.ExaminationDAO;
import com.tech.entities.MockTest;
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
public class TestServ extends HttpServlet {


  protected void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException, IOException{
      PrintWriter out=res.getWriter();
      MockTest m=new MockTest();
      m.setTitle(request.getParameter("Ttitle"));
      m.setDesc(request.getParameter("Tdesc"));
      m.setTimeLimit(Integer.parseInt(request.getParameter("Tlimit")));
      m.setNoQuestion(Integer.parseInt(request.getParameter("TQue")));
      
      ExaminationDAO dao=new ExaminationDAO(ConnectionProvider.getConnection());
      boolean f=dao.saveMockTest(m);
      if(f){
          out.print("done");
      }
      else{
           out.print("not done");
      }
  }
}
