package Lecture55;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =  1234;
		int ans = countsetbitsfaster(n);
		System.out.println(ans);
		
	}

	public static int countsetbitsfaster(int n) {//O(SetBits)
		// TODO Auto-generated method stub
		int count =  0;
		while(n>0) {
			n =  n& n-1;
			count++;
		}
		
		return count;
	}
	public static int countsetbits(int n) {//O(32)
		// TODO Auto-generated method stub
		int count =  0;
		while(n>0) {
			if((n&1) == 1) {
				count++;
			}
			n =  n>>1;
		}
		
		return count;
	}

}
