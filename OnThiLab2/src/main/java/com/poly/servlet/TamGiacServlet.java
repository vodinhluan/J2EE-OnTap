package com.poly.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/tam-giac", "/dien-tich", "/chu-vi"})
public class TamGiacServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		
		double a = Double.parseDouble(req.getParameter("a"));
		double b = Double.parseDouble(req.getParameter("b"));
		double c = Double.parseDouble(req.getParameter("c"));
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			double cv = a + b + c;
			String uri = req.getRequestURI();
			if (uri.contains("dien-tich")) { // Tinh Dien Tich
				double dt = Math.sqrt(cv * (a+b-c) * (a+c-b) * (b+c-a))/4;
				req.setAttribute("message", "Dien tich cua tam giac la: " +
				dt);

			} else {
				req.setAttribute("message", "Chu vi cua tam giac la: " +
						cv);
			}
		} else {
			req.setAttribute("message", "Khong thoa man tinh chat tam giac");
		}
		req.getRequestDispatcher("/views/tam-giac.jsp").forward(req, resp);
	}
}
