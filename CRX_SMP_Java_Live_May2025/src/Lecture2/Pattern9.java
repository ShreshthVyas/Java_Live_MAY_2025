package Lecture2;

import java.util.Scanner;

public class Pattern9 {

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
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			nst+=2;
			nsp--;
			row++;
		}
	}

}
