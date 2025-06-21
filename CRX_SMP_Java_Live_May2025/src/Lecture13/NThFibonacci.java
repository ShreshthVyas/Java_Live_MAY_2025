package Lecture13;


public class NThFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =8;
		
		int a = 0;
		int b =1;
		
		for (int i = 0; i < n; i++) {
			int c = a+b;
			a =b;
			b =c;
		}
		
		System.out.println(a);
		
		
		
	}

}
