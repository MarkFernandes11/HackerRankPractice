/******************************************************************************
*  Purpose: To answer a few queries where you need to tell the number located
*  			in yth position of xth line.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line of input contains an integer N, representing the total number 
*   of students. The next N lines contains a list of student information in the 
*   following structure:
*   
*   ID Name CGPA
*
*	Constraints :
*
*	+ 2 <= N <= 2000
*	+ 0 <= ID <= 100000
*	+ 5 <= |Name| <= 30
*	+ 0 <= CGPA <= 4.00
*
*	The name contains only lowercase English letters. The ID contains only integer 
*	numbers without leading zeros. The CGPA will contain, at most, 2 digits after 
*	the decimal point.
*                        
*	Output Format :
*   
*   After rearranging the students according to the above rules, print the first 
*   name of each student on a separate line.
*
******************************************************************************/

package com.practice.java.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practice.java.util.Utility;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 20 remaining including this
		System.out.println("Enter number of students");
		int studentCount = Utility.getInteger();
		List<Student> students = new ArrayList<Student>();
		List<Double> cgpas = new ArrayList<>();
		
		while(studentCount-- > 0) {
			System.out.println("Enter student id");
			int id = Utility.getInteger();
			System.out.println("Enter student name");
			String name = Utility.getLine();
			System.out.println("Enter student cgpa");
			double cgpa = Utility.getDouble();
			
			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setCgpa(cgpa);
			
			students.add(student);
			cgpas.add(cgpa);
		}
		
		Collections.sort(cgpas);
		
//		Collections.sort(students, (c1, c2) -> c1.getCgpa()>c2.getCgpa());
		
		
		for(int i=cgpas.size()-1; i>=0; i--) {		
			for(Student student : students) {
				if(cgpas.get(i).equals(student.getCgpa())) {
					System.out.println(student.getName());
					break;
				}
			}
		}
		
	}

}

class Student {
	
	private int id;
	private String name;
	private double cgpa;
	
	public Student() { }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
}
