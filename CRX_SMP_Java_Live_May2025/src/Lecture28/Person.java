package Lecture28;

public class Person {
	String name;
	int id;
	static int count = 0;
	int age;
	
//	public Person(int i) {//constructor
//		id  =i;
//	}
	public Person(int id,String name) {//constructor
		this.id  =id;
		this.name = name;
		count++;
	}
	
	public  void greet(String name) {
		System.out.println(this.name +" greets " + name);
	}
	
	public static void greet2() {
		System.out.println("hello");
	}
	
//	static {
//		int n  =10;
//		System.out.println("Hello from Static");
//		n++;
//		System.out.println(n);
//	}
	
	public void setAge(int age) throws Exception{
		try {
			if(age<0) {
				throw new Exception("Age can not be -ve");
			}
			else {
				this.age = age;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");
		}
		
		
	}
}
