package service;

import java.util.List;

import model.Student;

public interface ServiceInterface {
	public List<Student> insertDetails(Student student);
	
	public  void displayDetails();
	
    public void getData(int id);
    
//	public void getData(int age);

}
