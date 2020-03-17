package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.model.POJO;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.jdbc.Driver;

//import com.Model.*;


@SuppressWarnings("unused")
@WebServlet("/businessLogic")
public class businessLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		POJO obj = new POJO();
	
		PrintWriter out= resp.getWriter();
		
		obj.setName(req.getParameter("searchname"));
		obj.setPhone(req.getParameter("searchphone"));
		
		obj.setDeletename(req.getParameter("deletename"));
		obj.setDeletephone(req.getParameter("deletephone"));
	
		String name2=obj.getName();
		String phone2= obj.getPhone();
		
		String deletename=obj.getDeletename();
		String deletephone= obj.getDeletephone();
		
		out.print(name2);
		out.print(phone2);

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees","root","admin");
			out.println("connected");
			String sql1 = new String("select Employee_Name from empData where Phone = ".concat(phone2).concat(";"));
			String sql2 = new String("select Phone from empData where Employee_Name = ".concat("'").concat(name2).concat("'").concat(";"));
			 
			 
			Statement stm = con1.createStatement();
			
			
			
			out.println("Result : ");
			
			if(!phone2.isEmpty())
			{
				
			ResultSet res1 =  stm.executeQuery(sql1);
			while(res1.next()) {
				req.setAttribute("name",res1.getString(1));
				}
			req.getRequestDispatcher("response.jsp").forward(req, resp); 
			}
			
			else if(!name2.isEmpty() || name2!=null) {
				
				ResultSet res2 = stm.executeQuery(sql2);
				while(res2.next()) {
				req.setAttribute("phone",res2.getString(1));
				
				}
				req.getRequestDispatcher("response.jsp").forward(req, resp);
			}
			
		
				
			
			
			
			
			
		} catch (Exception e) {
			out.print("Records not available");
		}
		
		
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		POJO obj =new POJO();
		PrintWriter out= response.getWriter();
		
		obj.setName(request.getParameter("name"));
		obj.setPhone(request.getParameter("phone"));
		
		
	
		String name=obj.getName();
		String phone= obj.getPhone();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees","root","admin");
			
			out.print("connected");
			
			PreparedStatement pstm = con.prepareStatement("INSERT into empData(Employee_Name,Phone) values(?,?);");
			pstm.setString(1, name);
			pstm.setString(2, phone);
			int x = pstm.executeUpdate();
			
			if(x==1) {
				out.println("Data Entered");
			}else {out.println("not entered");}
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			out.print("Data Error");
		}
		
		
	}

}
