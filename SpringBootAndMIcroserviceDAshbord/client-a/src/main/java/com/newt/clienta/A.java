package com.newt.clienta;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class A {
	
	
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		   DateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
		  // System.out.println("Today's date is "+dateFormat.format(cal.getTime()));

		   cal.add(Calendar.DATE, -1);
		   System.out.println(dateFormat.format(cal.getTime())); 
	}

}
