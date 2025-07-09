package Lecture18;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		
		s= reverse(s);
		System.out.println(s);
		
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);

		return sb.reverse().toString();
	}

}
