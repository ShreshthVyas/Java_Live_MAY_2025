package Lecture55;

public class LuckyNumber {
	public static void main(String[] args) {
		int n = 15;
		int ans = findterm(n);
		System.out.println(ans);
	}

	private static int findterm(int n) {
		// TODO Auto-generated method stub
		int mul = 5;
		int ans = 0;
		while(n>0) {
			if((n&1) == 1) {
				ans = ans+mul;
			}
			mul =  mul*5;
			n= n>>1;
		}
		return ans;
		
	}
}
