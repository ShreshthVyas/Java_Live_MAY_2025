package Lecture21;

public class GenerateParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		parantheses(0,0,n,"");
	}

	public static void parantheses(int op, int cl, int n, String ans) {
		// TODO Auto-generated method stub
		if(op==n && cl==n) {//+ve basecase
			System.out.println(ans);
			return;
		}
		if(op>n || cl>n) {// -ve basecase
			return;
		}
		
		parantheses(op+1, cl, n, ans+"(");
		if(op>cl) {
			parantheses(op, cl+1, n, ans+")");
		}
		

	}

}
