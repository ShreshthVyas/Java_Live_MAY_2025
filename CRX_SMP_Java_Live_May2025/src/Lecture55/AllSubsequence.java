package Lecture55;

public class AllSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int n = s.length();
		
//		for (int i = 0; i < Math.pow(2, n); i++) {
//			
//		}
		for (int i = 0; i < (1<<n); i++) {
			printsub(s,i);
		}
	}

	private static void printsub(String s, int n) {
		// TODO Auto-generated method stub
		int idx = 0;
		while(n>0) {
			if((n&1) == 1) {
				System.out.print(s.charAt(idx));
			}
			idx++;
			n =  n>>1;
		}
		System.out.println();
	}

}
