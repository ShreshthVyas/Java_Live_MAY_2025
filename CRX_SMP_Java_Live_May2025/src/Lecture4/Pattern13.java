package Lecture4;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		
		while(row<= 2*n -1) {
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			if(row>=n) {// lower half or below the mirror
				nst--;
			}
			else {// uper half or above the mirror
				nst++;
			}
			
			row++;
		}
	}

}
