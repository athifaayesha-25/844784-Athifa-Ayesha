package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.EmployeeBean;

//@Configuration
//@ComponentScan(basePackages={"com.cts","com.controller"})
@Controller
public class MVCCRUD {
	//automatic dependency injection--without xml
	@Autowired
	EmpJDBCController dao2;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(EmployeeBean emp){
		dao2.save1(emp);
		return "redirect:/viewemps";//will redirect to viewemps request mapping
	}
	@RequestMapping("/viewemps")
	public String viewemp(Model m){
		List<EmployeeBean> list=dao2.getEmployees();
		m.addAttribute("emplist",list);
		return "viewemps";
		}
	
	
	
	
	
	@RequestMapping(value="/editemp/{eno}")
	public String edit(@PathVariable int eno, Model m){
	 EmployeeBean emp=dao2.getEmpById(eno);
	  m.addAttribute("command",emp);
	  return "Editcrud";
	}
	@RequestMapping(value="/editsave",method = RequestMethod.GET)
	public String editsave(@ModelAttribute("emp") EmployeeBean emp){
	  dao2.update(emp);
	  return "redirect:/viewemps";
	}
	@RequestMapping(value="/deleteemp/{eno}",method = RequestMethod.GET)
	public String delete(@PathVariable int eno){
	  dao2.delete(eno);
	  return "redirect:/viewemps";
	} 
	

}
