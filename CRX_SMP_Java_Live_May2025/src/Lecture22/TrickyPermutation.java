package Lecture22;

public class TrickyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababa";
		permutation(s,"");
	}

	public static void permutation(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		boolean vis[] = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(vis[ch-'a']==false) {
				String left = s.substring(0,i);
				String right = s.substring(i+1);
				permutation(left+right, ans+ch);
				vis[ch-'a'] = true;
			}
		}
	}

}
