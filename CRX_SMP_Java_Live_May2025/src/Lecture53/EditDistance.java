package Lecture53;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDistance(String s, String t) {
		Integer dp[][] =  new Integer[s.length()+1][t.length()+1];
		return rec(s,t,0,0,dp);
	}

	private int rec(String s, String t, int i, int j, Integer[][] dp) {
		// TODO Auto-generated method stub
		if(i == s.length()) {
			return t.length()-j;
		}
		if(j == t.length()) {
			return s.length()-i;// chars left in s ==> delete all
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int ans = 0;
		if(s.charAt(i)==t.charAt(j)) {
			ans = rec(s, t, i+1, j+1, dp);
		}
		else {
			int I = rec(s, t, i+1, j, dp);
			int R = rec(s, t, i+1, j+1, dp);
			int D = rec(s, t, i, j+1, dp);
			
			ans =  1+ Math.min(D, Math.min(I, R));
		}
		
		return dp[i][j]  = ans;
	}

}
