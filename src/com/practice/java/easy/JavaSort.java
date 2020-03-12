/******************************************************************************
*  Purpose: To sort the students based on their cgpa in descending order if their
*  			cgpa is same then sort them in ascending order.
*                        
*  @author  MarkF
*  @date   11-03-2020
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
import java.util.List;

import com.practice.java.util.Utility;

public class JavaSort {

	public static void main(String[] args) {

		System.out.println("Enter number of students");
		int studentCount = Utility.getInteger();
		List<Student> students = new ArrayList<Student>();

		while (studentCount-- > 0) {
			System.out.println("Enter student id");
			int id = Utility.getInteger();
			System.out.println("Enter student name");
			String name = Utility.getWord();
			System.out.println("Enter student cgpa");
			double cgpa = Utility.getDouble();

			Student student = new Student();
			student.setId(id);
			student.setName(name);
			student.setCgpa(cgpa);

			students.add(student);
		}

		int i, j;

		for (i = 0; i < students.size() - 1; i++) {
			
			for (j = i + 1; j < students.size(); j++) {
				
				if (Double.compare(students.get(j).getCgpa(), students.get(i).getCgpa()) > 0) {
					
					swapStudent(i, j, students);
					
				} else if (Double.compare(students.get(j).getCgpa(), students.get(i).getCgpa()) == 0) {
					
					if (students.get(j).getName().compareTo(students.get(i).getName()) < 0) {
						
						swapStudent(i, j, students);
					}
				}
			}
		}

		for (i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName());
		}
	}

	public static List<Student> swapStudent(int i, int j, List<Student> students) {
		Student temp = students.get(j);
		students.set(j, students.get(i));
		students.set(i, temp);

		return students;
	}

}

class Student {

	private int id;
	private String name;
	private double cgpa;

	public Student() {
	}

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

//System.out.println("For i cgpa = "+students.get(i).getCgpa()+" and name is "+students.get(i).getName());
//System.out.println("For j cgpa = "+students.get(j).getCgpa()+" and name is "+students.get(j).getName());
//System.out.println("Swap value for "+(students.get(i).getCgpa()+" "+students.get(i).getName())+" and "
//		+ students.get(j).getCgpa()+" "+students.get(j).getName()+" is "+(students.get(j).getCgpa() > students.get(i).getCgpa()));