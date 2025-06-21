package Lecture13;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
//		boolean b  = false;
		for (int i = 2; i < n; i++) {
			if(n%i == 0) {// not prime
//				System.out.println("not prime");
//				b =true;
				count++;
			}
		}
		
		if(count == 0) { 
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
