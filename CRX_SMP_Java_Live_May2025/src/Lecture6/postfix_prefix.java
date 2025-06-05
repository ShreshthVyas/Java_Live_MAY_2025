package Lecture6;

public class postfix_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
//		System.out.println(a++);
//		System.out.println(a);
		
//		System.out.println(++a);
		int b=34;
		int d = a++ + --b + 21 + --a + b-- + 2;
		
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		
		
		
		
	}

}
