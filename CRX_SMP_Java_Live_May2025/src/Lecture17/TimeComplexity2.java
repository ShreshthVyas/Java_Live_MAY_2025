package Lecture17;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		int n = 10;
		int i = 0;
		while (i < n) {
			System.out.println("Hello");
			i++;
		} // O(N)

		while (i < n) {
			//
			n--;
		} // O(N)

		while (i < n) {
			System.out.println("Hello");
			i += 2;
		} // O(N)

		while (i < n) {
			System.out.println("Hello");
			i += 2;
			i += 3;
		} // O(N)
		while (i < n) {
			System.out.println("Hello");
			n -= 3;
		} // O(N)

		int k = 2;

		while (i < n) {
			System.out.println("Hello");
			i += k;
		} // O(N/k)

		while (i < n) {

			n = n / 2;
		} // O(LogN)

		while (i < n) {

			n = n / 6;
		} // O(LogN)
		
		while (i < n) {
			
			n = n / k;
		} // O(LogN base k)
		
		while (i < n) {
			
			i = i*2;
		} // O(Log N)
		while (i < n) {
			
			i = i*k;
		} // O(LogN base k)
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n; a++) {
				System.out.println();
				
			}
		}//O(N^2)
		
		for (int j = 0; j < n; j++) {
			for (int a = j; a < n; a++) {
				
			}
		}//O(N^2)
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a <=j; a++) {
				
			}
		}// O(N^2)
		
		for (int j = 0;j*j <=n; j++) {
			
		}//O(sqrtN)
		
		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					
				}
			}
		}//O(n^4)
		
		for (int a = n/2; a <=n ; a++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					
				}
			}
		}//O(N^2 Log N)
		
		// Binary Search - O(Log N)
		// Linear Search - O(N)
		// Bubble Sort - O(N^2)
		// Insertion Sort - O(N^2)
		// Selection Sort - O(N^2)
		

	}

}
