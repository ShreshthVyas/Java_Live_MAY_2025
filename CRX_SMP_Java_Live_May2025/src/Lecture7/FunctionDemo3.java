package Lecture7;

public class FunctionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HEY");
		add();
		System.out.println("END");
	}
	
	public static void add() {
		int a = 10;
		int b = 20;
		int c =  a+b;
		sub();
		System.out.println(c);
	}
	
	public static void sub() {
		int a = 10;
		int b = 20;
		int c =  b-a;
		System.out.println(c);
	}

}
