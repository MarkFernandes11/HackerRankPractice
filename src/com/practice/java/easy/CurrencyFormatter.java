/******************************************************************************
*  Purpose: To format entered payment according to various country locale.   			
*                        
*  @author  MarkF
*  @date   14-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   A single double-precision number denoting payment.
* 
* 	Constraints :
* 
* 	0 <= payment <= 10^9
*   
*	Output Format :
*   
*   On the first line, print US: u where u is payment formatted for US currency.
*	On the second line, print India: i where i is payment formatted for Indian currency.
*	On the third line, print China: c where c is payment formatted for Chinese currency.
*	On the fourth line, print France: f, where f is payment formatted for French currency.
*
*	Link :
*	https://www.boraji.com/java-currency-class-example
*
******************************************************************************/

package com.practice.java.easy;

import java.text.NumberFormat;
import java.util.Locale;

import com.practice.java.util.Utility;

public class CurrencyFormatter {

	public static void main(String[] args) {
		
		System.out.println("Enter payment value");
		double payment = Utility.getDouble();
		
		Locale indianLocale = new Locale("en", "IN");
		
		currencyFormatter(Locale.US, "US", payment);
		currencyFormatter(indianLocale, "India", payment);
		currencyFormatter(Locale.CHINA, "China", payment);
		currencyFormatter(Locale.FRANCE, "France", payment);

		//Currency currency = Currency.getInstance(china.getCurrency().getCurrencyCode());
				
	}
	
	public static void currencyFormatter(Locale locale, String countryName, Double number) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		
		System.out.println(countryName + ": "+ numberFormat.format(number));
	}

}
