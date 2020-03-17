package com.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println("Date Class: "+date.toString());
		Date dNow=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'd' hh:mm:ss a zzz");
		System.out.println("Current date: "+ft.format(dNow));
		
		
		LocalDate date1=LocalDate.now();
		LocalDate yesterday=date1.minusDays(1);
		System.out.println("Today date: "+date1);
		System.out.println("Yesterday date: "+yesterday);
		
		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time: "+time);
		
		
		Year y=Year.of(2019);
		LocalDate l=y.atDay(90);
		System.out.println("2019: (90th day:"+l);
		
		
		//parsing String to Date object
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyy hh:mm:ss");
		String dateInString="15-10-2015 10:20:56";
		Date date4=sdf.parse(dateInString);
		System.out.println("String to Date: "+date4);
		

	}

}
