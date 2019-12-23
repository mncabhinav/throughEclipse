package com.test;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

public class DateTimeMillies {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateString = "19-11-2019 11:50:00 PM";
		String[] str = dateString.split(" ");
		if (str[2].equalsIgnoreCase("PM")) {
			int j = 0;
			String s1 = str[1];
			String[] s = str[1].split(":");

			int i = Integer.parseInt(s[0]);
			if (i >= 1 && i <= 11) {
				j = i + 12;
				String[] s2 = s1.split(":");
				s2[0] = "" + j;
				String s3 = s2[0] + ":" + s2[1] + ":" + s2[2];
				dateString = str[0] + " " + s3;
				System.out.println(dateString);

			} else {
				dateString = dateString.replaceAll(str[2], "");
				System.out.println(dateString);
			}

		} else if (str[2].equalsIgnoreCase("AM")) {
			dateString = dateString.replaceAll(str[2], "");
			System.out.println(dateString);
		}

		Date date = sdf.parse(dateString);
		System.out.println("Time in milliseconds : " + date.getTime());
		
		test();
		// test2();

	}
	
	public static void test() throws ParseException {
			String input = "25/11/2019 23:50:00";
			DateFormat outputformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    Date date = outputformat.parse(input);
		    long s = date.getTime();
		    System.out.println("Time in milliseconds : " + s);
	}
	
	public static void test2() {
		  String input = "3/9/2015 15:00:02";
	      DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
	      DateFormat outputformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	      Date date = null;
	      String output = null;
	      try{
	    	 date= df.parse(input);
	    	 output = outputformat.format(date);
	    	 System.out.println(input+"  "+output);
	    	 
	    	 Date dateTime24 = outputformat.parse(output);
	    	 System.out.println("Time in milliseconds : " + dateTime24.getTime());
	      }catch(ParseException pe){
	         pe.printStackTrace();
	       }
	}
}

