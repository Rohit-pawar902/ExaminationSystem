 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.servlet;

import com.tech.dao.ExamineeDAO;
import com.tech.dao.StudentDAO;
import com.tech.entities.Examinee;
import com.tech.entities.Message;
import com.tech.entities.Student;
import com.tech.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */

@MultipartConfig
public class RegisterServ extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String check = req.getParameter("check");
        int c = Integer.parseInt(check);
        if (c == 1) {//studentRegistration
            Student user = new Student();
            user.setName(req.getParameter("uname"));
            user.setEmail(req.getParameter("uemail"));
            user.setGender(req.getParameter("ugen"));
            user.setPassword(req.getParameter("upass"));
            user.setField(req.getParameter("eduField"));
            user.setMobile(req.getParameter("umob"));
            StudentDAO save = new StudentDAO(ConnectionProvider.getConnection());
            Boolean Status = save.saveUser(user);
            if (Status) {
                out.print("done");
                Message m1 = new Message("Registration successfull", "Cofirmation", "alert-primary");
                HttpSession s = req.getSession();
                s.setAttribute("currentUser", user);
                s.setAttribute("done", m1);
            } else {
                Message m1 = new Message("Registration not successfull might you already Registered with same Email ID", "Cofirmation", "alert-primary");
                HttpSession s = req.getSession();
                s.setAttribute("not_done", m1);   
            }
        }
        else{
            Examinee user = new Examinee();
            user.setName(req.getParameter("uname"));
            user.setEmail(req.getParameter("uemail"));
            user.setGender(req.getParameter("ugen"));
            user.setPassword(req.getParameter("upass"));
            user.setCourseAccessPass(req.getParameter("ucpass"));
            user.setField(req.getParameter("eduField"));
            user.setMobile(req.getParameter("umob"));
            ExamineeDAO save = new ExamineeDAO(ConnectionProvider.getConnection());
            Boolean Status = save.saveUser(user);
            
            if (Status) {
                out.print("done");
                Message m1 = new Message("Registration successfull", "Cofirmation", "alert-primary");
                HttpSession s = req.getSession();
                s.setAttribute("currentUser", user);
                s.setAttribute("done", m1);                                             
            } else{
                 out.print(user);
                Message m1 = new Message("Registration not successfull might you already Registered with same Email ID", "Cofirmation", "alert-primary");
                HttpSession s = req.getSession();
                s.setAttribute("not_done", m1);   
            }
        }
         
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            res.sendRedirect("index.jsp");

        } catch (IOException ex) {
            Logger.getLogger(RegisterServ.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
}
