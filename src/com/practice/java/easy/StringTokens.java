/******************************************************************************
*  Purpose: To print the number of tokens, followed by each token on a new line.  			
*                        
*  @author  MarkF
*  @date   03-03-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   A single string, s.
*
*	Constraints :
*
*	--1 <= length of s <= 4*10^5
*
*	--s is composed of any of the following: English alphabetic letters, blank spaces
*	, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_)
*	, apostrophes ('), and at symbols (@).
*                        
*	Output Format :
*   
*   On the first line, print an integer, n, denoting the number of tokens in string s (they do
*   not need to be unique). Next, print each of the n tokens on a new line in the same order 
*   as they appear in input string s.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class StringTokens {

	public static void main(String[] args) {
		
		System.out.println("Enter a string ");
		String string = Utility.getLine();
		
		string = specialCharactersRemovedString(string);
		
		if(string.length() != 0) {
			String[] stringArray = string.split("\\s+");
			
			System.out.println(stringArray.length);
			for(String s : stringArray) {
				System.out.println(s);
			}
		} else {
			System.out.println(string.length());
		}
	
	}
	
	private static String specialCharactersRemovedString(String string) {
		string = string.replace('!', ' ').replace('?', ' ').replace(',', ' ')
				.replace('\'', ' ').replace('.', ' ').replace('_', ' ').replace('@', ' ')
				.replace("\\n", " ").replace("\\t", " ").trim();
		
		return string;
	}

}

// 29 more in easy and unsolved

//He is a very \nvery\t\t good boy, isn't he? test

// Test case 8
//,_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.