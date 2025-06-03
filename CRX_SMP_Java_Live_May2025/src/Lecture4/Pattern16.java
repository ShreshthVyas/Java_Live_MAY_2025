package Lecture4;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int nst =n;
		int nsp = n-1;
				
		int row = 1;
		while(row<= 2*n-1) { // row<2*n
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			if(row<n) {// lower half
				nst--;
				nsp--;
			}
			else {// Upper half
				nsp++;
				nst++;
			}
			row++;
			
		}
		
	}

}
