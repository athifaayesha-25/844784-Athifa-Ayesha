package com.dao;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.Employee_Jdbc;

////ADD MYSQL JAR FILE
public class Employee_JdbcTemplate1 {
	//read the db connection from xml file
	DataSource datasource;
	//handle sql statements
	JdbcTemplate jdbctemplate;
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jdbctemplate=new JdbcTemplate(datasource);
		
	}
	
	public List<Employee_Jdbc> listemp()
	{
		String SQL="select * from emp1";
		List<Employee_Jdbc> emps=jdbctemplate.query(SQL, new EmployeeMapper());
		return emps;
	}
}
