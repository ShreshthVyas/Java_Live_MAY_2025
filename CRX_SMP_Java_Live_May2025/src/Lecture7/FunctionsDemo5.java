package Lecture7;

public class FunctionsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  =10;
		int b = 20;
		int c = 40;
		int d = add(a,b);
		System.out.println(d);
		System.out.println(c+d);
	}
	
	
	public static int add(int d, int e) {
		int c = d+e ;
		return c;
	}

}
