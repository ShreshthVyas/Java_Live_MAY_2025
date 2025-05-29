package Lecture3;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int row =1;
		int nst =1;
		int nsp = n-1;
		
		while(row<=n) {
			int val =1;
			//space
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			//star
			int cst =0;
			while(cst<nst) {
				System.out.print(val + " ");
				
				if(cst<(nst/2)) {// left half of the triangle
					val++;
				}
				else {
					val--;
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
