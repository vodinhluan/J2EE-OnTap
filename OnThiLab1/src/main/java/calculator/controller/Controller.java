package calculator.controller;

import java.io.IOException;
import java.io.PrintWriter;

import calculator.model.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/","/ketqua"})
public class Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.getRequestDispatcher("/maytinh.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {		
		String ketqua = "";
		try {
			String action = req.getParameter("action");
			double a = Double.parseDouble(req.getParameter("a"));
			double b = Double.parseDouble(req.getParameter("b"));
			if (action.equals("+")) {
				Calculator maytinh = new Calculator();
				ketqua = a + " + " + b + " = " + maytinh.cong(a, b);
						
			} else if (action.equals("-")) {
				Calculator maytinh = new Calculator();
				ketqua = a + " - " + b + " = " + maytinh.tru(a, b);
			} else if (action.equals("*")) {
				Calculator maytinh = new Calculator();
				ketqua = a + " * " + b + " = " + maytinh.nhan(a, b);
			} else if (action.equals("/")) {
				Calculator maytinh = new Calculator();
				ketqua = a + " / " + b + " = " + maytinh.chia(a, b);
			}
			
			req.setAttribute("message", ketqua);
			req.getRequestDispatcher("/views/ketqua.jsp").forward(req, resp);


		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
