package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.POJO;


@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees","root","admin");
		
		
		POJO obj = new POJO();
		
		PrintWriter out= response.getWriter();
		
		obj.setDeletename(request.getParameter("deletename"));
		obj.setDeletephone(request.getParameter("deletephone"));
	
		
		String deletename=obj.getDeletename();
		String deletephone= obj.getDeletephone();
		
	
		String sql = "DELETE FROM empData WHERE Employee_Name = '".concat(deletename).concat("'").concat(";");
		Statement stm0 = con2.createStatement();
		
		if(deletename!=null ||!deletename.isEmpty())
		{
			
			stm0.executeUpdate(sql);
			out.print("Record Removed...");
			
		}
		
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
