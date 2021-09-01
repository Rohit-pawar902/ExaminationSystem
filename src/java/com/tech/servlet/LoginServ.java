/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.servlet;

import com.tech.dao.AdminDAO;
import com.tech.dao.ExamineeDAO;
import com.tech.dao.StudentDAO;
import com.tech.entities.Admin;
import com.tech.entities.Examinee;
import com.tech.entities.Message;
import com.tech.entities.Student;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class LoginServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String userEmail = request.getParameter("uemail");
        String userPass = request.getParameter("upass");

        StudentDAO dao = new StudentDAO(ConnectionProvider.getConnection());
        Student u = null;
        u = dao.getUserByEmailAndPass(userEmail, userPass);
        ExamineeDAO dao1 = new ExamineeDAO(ConnectionProvider.getConnection());
        Examinee u1 = null;
        u1 = dao1.getUserByEmailAndPass(userEmail, userPass);
        AdminDAO dao2 = new AdminDAO(ConnectionProvider.getConnection());
        Admin u2 = null;
        u2 = dao2.getUserByEmailAndPass(userEmail, userPass);
        if (u2 != null) {//Admin
             //we have to jump into first page of web site 
            //enabling session
            HttpSession session = request.getSession(true);
            session.setAttribute("currentUser", u2);
            response.sendRedirect("./AdminProfile.jsp");
        } else if (u1 != null) {//Eaminee
            //we have to jump into first page of web site 
            //enabling session
            HttpSession session = request.getSession(true);
            session.setAttribute("currentUser", u1);
            response.sendRedirect("./ExamineeProfile.jsp");

        } else if (u != null) {//Student
            //we have to jump into first page of web site 
            //enabling session
            HttpSession session = request.getSession(true);
            session.setAttribute("currentUser", u);
            response.sendRedirect("./Profile.jsp");

        } else {//Worng Email and password

            Message m = new Message("Email id and PassWord are not correct", "Error", "alert-warning");
            HttpSession s = request.getSession();
            s.setAttribute("msg", m);
            response.sendRedirect("Login.jsp");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("Login.jsp");
    }
}
