package Lecture55;

public class Checkithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 10;
		int i =2;
		
		boolean ans  = check(n,i);
		System.out.println(ans);
		
	}

	public static boolean check(int n, int i) {
		// TODO Auto-generated method stub
		int mask = 1<<i;
		if((n&mask) == 0) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
