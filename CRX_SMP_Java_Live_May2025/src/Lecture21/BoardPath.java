package Lecture21;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		board(0,n,"");
	}

//	public static void board(int curr, int n, String ans) {
//		// TODO Auto-generated method stub
//		if(curr == n) {
//			System.out.println(ans);
//			return;
//		}
//		
//		if(curr>n) {
//			return;
//		}
//		
//		board(curr+1, n, ans+1);
//		board(curr+2, n, ans+2);
//		board(curr+3, n, ans+3);
//	}
	
	public static void board(int curr, int n, String ans) {
		// TODO Auto-generated method stub
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		
		if(curr>n) {
			return;
		}
		
		for (int i = 1; i <=n; i++) {
			board(curr+i, n, ans+i);
		}
		
	}

}
