/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class Calcualte extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            
            String name=request.getParameter("Name");
            int a1=Integer.parseInt(request.getParameter("t1"));
            int a2=Integer.parseInt(request.getParameter("t2"));
            int a3=Integer.parseInt(request.getParameter("t3"));
            int a4=Integer.parseInt(request.getParameter("t4"));
            int a5=Integer.parseInt(request.getParameter("t5"));
            int a6=Integer.parseInt(request.getParameter("t6"));
            int a7=Integer.parseInt(request.getParameter("t7"));
            int a8=Integer.parseInt(request.getParameter("t8"));
            float sum=a5+a7;
            float total= a6+a8;
            float perc= sum*100/total;
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcualte</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Candidate Name is:</h1>" + name );
            out.println("<h1>Percentage Of LAB Attendance</h1>" + (a1*100)/a2 );
            out.println("<h1>Percentage Of Theory Attendance</h1>" + (a3*100)/a4 );
            out.println("<h1>Percentage</h1>" + perc+"<br>");
            String ch="fail";
            if(perc>=80)
            {
                ch="O Grade";
            }
            else if(perc<80 && perc>=60)
            {
                ch="A Grade";
                
            }
            else if (perc <60 && perc>=55)
            {
                ch="B Grade";
                
            }
            else if (perc <55 && perc>=45)
            {
                ch="C Grade";
            }
            else
            {
                ch="Fail";
            }
            out.println("Final Grade: " + ch );
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
