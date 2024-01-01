package com.poly.servlet;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dang-ky")
public class DangKyServlet extends HttpServlet {	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		String username = req.getParameter("username");
		boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
		boolean married = (req.getParameter("married") != null);
		String country = req.getParameter("country");
		String []hobbies = req.getParameterValues("hobbies");
		
		System.out.println(">>username: " + username);
		System.out.println(">>gender: " + gender);
		System.out.println(">>married: " + married);
		System.out.println(">>country: " + country);
		System.out.println(">>hobbies: " + Arrays.toString(hobbies));
		req.getRequestDispatcher("/views/result.jsp").forward(req, resp);

	}
}

