package Lecture4;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = 1;
		int nsp = n/2;
		
		while(row<=n) {
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
			if(row< n/2+1) {
				nst+=2;
				nsp--;
			}
			else {
				nst-=2;
				nsp++;
			}
			row++;
		}
		
		
	}

}
