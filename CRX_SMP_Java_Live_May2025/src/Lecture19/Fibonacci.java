package Lecture19;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n ==1 || n==0) {
			return n;
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1+ f2;
	}

}
