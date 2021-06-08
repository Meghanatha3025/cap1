
class College {
 public void move() {
  System.out.println("College is open");
 }
}
class Univ extends College {
 public void move() {
  System.out.println("University is open too");
 }
}

public class Student {
	 public static void main(String args[]) {
		  College a = new College();
		  College b = new Univ();
		  
		  a.move();
		  b.move();
		  System.out.println("main class");
		
		 }
}
