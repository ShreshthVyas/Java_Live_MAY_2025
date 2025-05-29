package Lecture3;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		int nsp = n-2;
		while(row<=n) {
			if(row ==1 || row==n) {// first or last row
				int cst = 0;
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
			}
			else {
				//first star
				System.out.print("* ");
				
				//n-2 spaces
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				//last star
				System.out.print("* ");
			}
			System.out.println();//line change
			row++;// row = row+1
		}
		
	}

}
