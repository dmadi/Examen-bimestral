/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unitec.examen;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.rmi.server.Dispatcher;

/**
 *
 * @author T107
 */
//@WebServlet(name = "resultados", urlPatterns = {"/resultados"})
public class ServletExamen extends HttpServlet {

    
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.getDispatcherType("presentacion.jsp");
    }
    Evaluacion u= new Evaluacion();
    Evaluacion n1= new Evaluacion("Ana",7);
    u.add(n1);
  return u;
      
 public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.getDispatcherType("servicio-calificaciones.jsp");
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
@Requestmapping(Value="Evaluacion", method.RequestMetod.GET headers={"Accept=Application/json"});

@ResponseBody ArrayList<Evaluacion> = new ArrayList<Evaluacion>(); 

return Evaluacion generarcalificaciones();
}
}