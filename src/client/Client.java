package client;

import java.util.Scanner;


import model.Student;
import service.Service;

public class Client {

	static Scanner sc = new Scanner(System.in);
	static Student student;

	public static void main(String[] args) {
		System.out.println("after main method");
		Service service = new Service();
		short choice = 0;

		do {
			System.out.println("enter your choice");
			System.out.println("press 1 insert ");
			System.out.println("press 2 display");
			System.out.println("press 3 display");
			System.out.println("press 4 for exit");
			choice = sc.nextShort();
			switch (choice) {
			case 1: service.insertDetails(student);
				break;
			case 2:
				service.displayDetails();
				break;
			case 3:
				System.out.println("enter id want to search the data");
				int id=sc.nextInt();
				service.getData(id);

				break;
			case 4:
				System.out.println("EXIT");
				break;

			default:
				System.out.println("eneter above given choice");
				break;
			}
			System.out.println("end of main");

		} while (true);
		

	}
}
