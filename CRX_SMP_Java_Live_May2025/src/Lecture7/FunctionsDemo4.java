package Lecture7;

import java.util.Scanner;

public class FunctionsDemo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =  sc.nextInt();
		System.out.println("HEY");
		add(a,b);
		add(20,40);
		add(80,90);
		add(89,40);
		System.out.println("BYE");
	}
	
	public static void add(int d, int e) {
		int c = d+e ;
		System.out.println(c);
	}
}
