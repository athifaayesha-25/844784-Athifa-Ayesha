package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.EmployeeBean;

//@Configuration
//@ComponentScan(basePackages={"com.cts","com.controller"})
public class EmpJDBCController {
	JdbcTemplate template1;//dbconn getting from xml file
	public void setTemplate1(JdbcTemplate template1){
		this.template1=template1;	
	}
	//insert
	public int save1(EmployeeBean p)
	{
		String sql="insert into emp1(emp_eno,emp_name,salary)values("+p.getEmp_eno()+",'"+p.getEmp_name()+"',"+
				p.getSalary()+")";
		return template1.update(sql);//commit--executequery
	}
	
	//EmpjdbcController.............after insert
	public int update(EmployeeBean p){
	 String sql="update emp1 set name='"+p.getEmp_name()+"', salary="+p.getSalary()+" where eno="+p.getEmp_eno()+"";
	   return template1.update(sql);
	 }
	 public int delete(int emp_eno){
	   String sql="delete from emp1 where emp_eno="+emp_eno+"";
	   return template1.update(sql);
	 }
	 public EmployeeBean getEmpById(int emp_eno){
	 String sql="select * from emp1 where emp_eno=?";
	   return template1.queryForObject(sql, new Object[]{emp_eno},new BeanPropertyRowMapper<EmployeeBean>(EmployeeBean.class));
	 }  
	//select
	public List<EmployeeBean> getEmployees(){
		return template1.query("select*from emp1",new RowMapper<EmployeeBean>(){
			public EmployeeBean mapRow(ResultSet rs,int row) throws SQLException{
				EmployeeBean e=new EmployeeBean();
				e.setEmp_eno(rs.getInt(1));
				e.setEmp_name(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				return e;//beanobject	
			}
		});
	}

}
