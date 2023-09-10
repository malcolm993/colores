/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.color.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Tango
 */
@WebServlet(urlPatterns = "/color-app")
public class ColorSerlvet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String colorB = req.getParameter("colorB");
        String colorL = req.getParameter("colorL");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><head><meta charset=\"UTF-8\"><title>Color App</title><style>body{font-size:1.3rem;font-family:sans-serif;background:" + colorB + "; color: " + colorL + "}</style></head><body><h1>Color App</h1><p>Una sencilla app para demostrar el funcionamiento de Java Servlets</p><h2>Otras cosas que " + nombre + " debe aprender</h2><ul><li>HTML y CSS</li><li>Algo de JS</li><li><strong>Git y Github</strong></li></ul></body></html>");

        }
    }
}
