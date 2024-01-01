package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchAccount extends HttpServlet {
	protected void processRequest(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		// lấy thông tin từ form và in KQ trả về
		PrintWriter out = res.getWriter();
		out.println("<html><head>Search Account</head></html>");
		out.println("<body><h1>Ket qua tra dien thoai theo yeu cau cua ban</h1>");
		out.println("<table border=1 cellPading=1 cellSpacing=1>");
		String tenthuebao = req.getParameter("name");
		
		// ket noi và xay dung SQL
		String newSQL = "SELECT * FROM CUSTOMER";
		if (tenthuebao != null && tenthuebao.length()  != 0) {
			newSQL = newSQL + "where TenThueBao like '%" + "tenthongbao" + "%'" ;
		}
		String conStr = "jdbc:sqlserver://..";
		Statement stmt = null; // thực thi truy vấn
		ResultSet rs = null; // truy cập dữ liệu
		try {
			Connection con = null; // tạo kết nối
			Class.forName("com.microsoft.sql...");
			stmt = con.createStatement();
			rs = stmt.executeQuery(newSQL);
			out.println("<tr><th>So thu tu<th><th>...<th></tr>\n");
			
			if (rs != null) {
				for (int i = 1; rs.next();) {
					out.println("<tr>"
							+ "<td>" + i + "<td>"
							+ "<td>" + rs.getString(2) + "<td>"
							+ "</tr>");
				}
			}
			out.println("</table>");
			rs.close();
			stmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		processRequest(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		processRequest(req, res);

	}
}
