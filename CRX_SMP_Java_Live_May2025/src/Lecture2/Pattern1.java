package Lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst = n;
		
		while(row<=n) {
			if(row ==1 || row==n) {// first or last row
				int cst = 0;
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
			}
			else {
				
			}
			System.out.println();//line change
			row++;// row = row+1
		}
		
	}

}
