package Lecture19;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		int ans = sum(n);
		
		System.out.println(ans);
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		
		int temp = sum(n-1);
		
		return temp + n;
		
	}

}
