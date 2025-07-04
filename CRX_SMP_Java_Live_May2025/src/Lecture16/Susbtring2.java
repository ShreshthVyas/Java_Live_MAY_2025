package Lecture16;

public class Susbtring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcd";
		
		substring(s);
	}

	public static void substring(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=s.length(); i++) {// length of substring
			for (int j = 0; j <= s.length()-i; j++) {//starting points
				System.out.println(s.substring(j,j+i));
			}
		}
		
	}

}
