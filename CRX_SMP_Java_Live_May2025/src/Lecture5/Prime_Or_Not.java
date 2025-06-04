package Lecture5;

import java.util.Scanner;

public class Prime_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		for (int i = 2; i <= n-1; i++) {
			if(n%i == 0) { // i is a factor of n 
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
