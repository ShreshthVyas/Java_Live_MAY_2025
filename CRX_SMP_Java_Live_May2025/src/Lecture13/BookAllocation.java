package Lecture13;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();
		int nos = sc.nextInt();
		int books[] = new int[nob];
		
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		
		int ans = binarysearch(books,nos,nob);
		System.out.println(ans);
		
	}

	public static int binarysearch(int[] books, int nos, int nob) {
		// TODO Auto-generated method stub
		int lo =0;
		int hi =0;
		int ans =0;
		
		for (int i = 0; i < books.length; i++) {// sum of all pages 
			hi+= books[i];
		}
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitPossible(mid,books,nos,nob)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
	}

	public static boolean isitPossible(int mid, int[] books, int nos, int nob) {
		// TODO Auto-generated method stub
		int s = 1;
		int pages_read = 0;
		for (int i = 0; i < books.length;) {
			if(pages_read + books[i]<= mid) {
				pages_read+= books[i];
				i++;
			}
			else {
				s+=1;
				pages_read = 0; 
			}
			if(s>nos) {
				return false;
			}
		}
		return true;
	}

}
