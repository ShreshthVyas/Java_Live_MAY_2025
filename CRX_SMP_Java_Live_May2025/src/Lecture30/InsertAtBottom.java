package Lecture30;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		iab(st,60);
		System.out.println(st);
	}

//	private static void iab(Stack<Integer> st, int i) {//T.C -O(N) S.C-O(N)
//		// TODO Auto-generated method stub
//		Stack<Integer>  h = new Stack<>();
//		
//		while(!st.isEmpty()) {
//			int a = st.pop();
//			h.push(a);
//		}
//		st.push(i);//i pushed at bottom
//		while(!h.isEmpty()) {
//			int a = h.pop();
//			st.push(a);
//		}
//		
//	}
	private static void iab(Stack<Integer> st, int i) {//T.C -O(N) S.C-O(1)
		if(st.isEmpty()) {
			st.push(i);
			return ;
		}
		
		int a = st.pop();
		iab(st, i);
		st.push(a);
	}

}
