package Lecture21;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m = 3;
		maze(1,1,n,m,"");
		
	}

	public static void maze(int cr, int cc, int n, int m, String ans) {
		// TODO Auto-generated method stub
		if(cr == n && cc==m) {
			System.out.println(ans);
			return;
		}
		if(cr>n || cc>m) {
			return;
		}
		
		maze(cr+1, cc, n, m, ans+"V");
		maze(cr, cc+1, n, m, ans+"H");
		maze(cr+1, cc+1, n, m, ans+"D");
		
	}

}
