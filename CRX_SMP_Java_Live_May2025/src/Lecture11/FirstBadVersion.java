package Lecture11;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		int i = 1;
		int j = n;
		int ans =0;
		while(i<=j) {
			int mid = i + (j-i)/2;
			if(isBadVersion(mid)) {// left half
				ans = mid;
				j = mid-1;
			}
			else { // right 
				i = mid+1;
			}
		}
		
		return ans;
		
	}
	
	public boolean isBadVersion(int n) {
		// implemented by leetcode return t if version is bad else false
		return false;
	}

}
