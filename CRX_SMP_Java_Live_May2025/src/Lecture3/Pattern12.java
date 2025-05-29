package Lecture3;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int row =1;
		int nst =1;
		int nsp = n-1;
		while(row<=n) {
			//space
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//star
			int cst =0;
			while(cst<nst) {
				if(cst%2==0) {//cst is even
					System.out.print("* ");
				}
				else {// cst is odd
					System.out.print("!  ");
				}
				cst++;
			}
			System.out.println();
			nst+=2;
			nsp--;
			row++;
	}
	}

}
