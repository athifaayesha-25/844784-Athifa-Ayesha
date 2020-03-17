package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.Employee_Jdbc;

public class EmployeeMapper implements RowMapper<Employee_Jdbc> {

	@Override
	public Employee_Jdbc mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Employee_Jdbc e1=new Employee_Jdbc();
		e1.setEmp_eno(rs.getInt("emp_eno"));//table column name
		e1.setEmp_name(rs.getString("emp_name"));//table column name
		e1.setSalary(rs.getFloat("salary"));//table column name
		return e1;
	}

}
