/******************************************************************************
*  Purpose: To get name of day, based on entered date, month and year.     			
*                        
*  @author  MarkF
*  @date   14-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   A single line of input containing the space separated month, day and year, 
*   respectively, in MMDDYYYY format.
* 
* 	Constraints :
* 
* 	2000 < year < 3000
*   
*	Output Format :
*   
*   Output the correct day in capital letters.
*
******************************************************************************/

package com.practice.java.easy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.practice.java.util.Utility;

public class DateAndTime {

	public static void main(String[] args) {
		
		System.out.println("Enter month number");
		int month = Utility.getInteger();
		
		System.out.println("Enter day");
		int day = Utility.getInteger();
		
		System.out.println("Enter year");
		int year = Utility.getInteger();
		
		String result = findDay(month, day, year);
		
		System.out.println(result.toUpperCase());
		

	}
	
	public static String findDay(int month, int day, int year) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DAY_OF_MONTH, day);		
		calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.HOUR, 0);
	    calendar.set(Calendar.AM_PM, Calendar.AM);
		
		Date date = calendar.getTime();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		return simpleDateFormat.format(date);

    }	
}
