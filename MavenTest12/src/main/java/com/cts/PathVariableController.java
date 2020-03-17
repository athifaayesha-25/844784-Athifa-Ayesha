package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PathVariableController {
	
	/*
	 * Binding a URI Template variable to a
	 * method parameter using 'name' or 'value'
	 * attribute of @PathVariable
	 */

	@RequestMapping("/path2/{name}/{age}")
	public ModelAndView pathVariableDemo(
			@PathVariable("name") String name,
			@PathVariable("age") String age){
		ModelAndView mv=new ModelAndView("PathParameter");
		mv.addObject(name);
		mv.addObject(age);
		return mv;
		
	}
}
