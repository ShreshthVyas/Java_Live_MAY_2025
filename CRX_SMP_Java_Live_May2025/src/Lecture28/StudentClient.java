package Lecture28;


public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.id = 10;
		s.name = "random";
		s.greet();
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		Student s1 = new Student();
		s1.id = 20;
		s1.name = "random2";
		s1.greet();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		
		
	}

}
