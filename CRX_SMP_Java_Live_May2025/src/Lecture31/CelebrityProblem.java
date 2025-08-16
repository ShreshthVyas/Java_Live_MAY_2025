package Lecture31;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {0, 0, 1, 0}, {0, 0, 1, 0},{0, 0, 0, 0},{0, 0, 1, 0}};
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			
			if(arr[a][b] == 1) {
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
		
		int c = st.pop();
		boolean b =true;
		for (int i = 0; i < arr.length; i++) {
			if(i==c) {
				continue;
			}
			if(arr[i][c]!=1) {
				b = false;
				break;
			}
			if(arr[c][i]!=0) {
				b =false;
				break;
			}
		}
		
		if(b) {
			System.out.println(c);
		}
		else {
			System.out.println("No Celeb");
		}
		
	}

}
