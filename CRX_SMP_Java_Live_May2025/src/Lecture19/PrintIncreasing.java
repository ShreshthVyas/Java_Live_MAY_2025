package Lecture19;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =10;
		
		print(10);
	}

//	public static void print(int i, int n) {
//		// TODO Auto-generated method stub
//		if(i>n) {
//			return ;
//		}//base case
//		
//		System.out.println(i);//sub-problem
//		print(i+1,n);//recursive call
//		
//	}
	
	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println(0);
			return;
		}
		
		print(n-1);
		
		System.out.println(n);
		
	}

}
