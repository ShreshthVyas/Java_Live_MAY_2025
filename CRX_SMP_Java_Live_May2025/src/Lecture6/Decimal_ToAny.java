package Lecture6;

import java.util.Scanner;

public class Decimal_ToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int base = sc.nextInt();
		int ans =0;
		int mul = 1;
		while(n>0) {
			int digit = n%10;
			ans = ans + digit*mul;
			mul = mul*base;
			n = n/10;
		}
		
		System.out.println(ans);
	}

}
