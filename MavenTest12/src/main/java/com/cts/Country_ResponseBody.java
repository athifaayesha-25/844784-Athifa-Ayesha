package com.cts;
/*
  ResponseBody:
  --used only if the request mapping returns java class object
  --convert the body of the HTTP request to the java class object with the aid of selected
  HTTP message converter.
  JSON(Javascript Object Notation):
  --JSON is language and platform-independent.
  --lightweight data-interchange format
  --to transmit data between a server and web application,serving as an alternative to XML
  --keys are strings and the values are the JSON types.
  --subset of Javascript.We can convert any javascript object into JSON and send JSON to the
  server.
  --JSON is preferred over XML is that it has a more readable format,
  ex:{},[]
   */

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Country_ResponseBody {
	@RequestMapping(value="/country11",method=RequestMethod.GET)
	public @ResponseBody CountryBean getCountry()
	{
		//response is not as a view file
		//response is object--.json
		return new CountryBean("India","Winter");	
	}
	@RequestMapping(value="/country12",method=RequestMethod.GET)
	public @ResponseBody List<CountryBean> getCountries()
	{
		List<CountryBean> comp=new ArrayList<CountryBean>();
		comp.add(new CountryBean("USA","tropical"));
		comp.add(new CountryBean("SYDNEY","dry winters"));
		comp.add(new CountryBean("FRANCE","ice core"));
		return comp;
	}

}
