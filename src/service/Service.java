package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;

public class Service implements ServiceInterface {

	Student student = new Student();
	static List<Student> list = new ArrayList<>();

	public List<Student> insertDetails(Student student) {
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = 0;
		System.out.println("enter the numberOfStudent details you want add");
		numberOfStudents = sc.nextInt();
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("enter the id of student");
			int id = sc.nextInt();
			System.out.println("enter the name of student");
			String name = sc.next();
			System.out.println("enter the age of student");
			int age = sc.nextInt();
			student = new Student(id, name, age);
			list.add(student);
		}
		return list;
	}

	public void displayDetails() {
		for (Student std : list) {
			System.out.println(std);
		}
	}

	public void getData(int id) {
		for (Student std : list)

		{
			if (student.getId() == id) {
				System.out.println(std);
			}
		}
	}
//	public void getData(int age)
//	{
//		for(Student std:list)
//
//		{
//			if(student.getAge()==age)
//			{
//			   
//			}
//		}
//	}
}