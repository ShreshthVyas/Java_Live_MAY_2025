package Lecture15;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String t = new String("hello");
		
		System.out.println(equalsto(s,t));
		
		System.out.println(s.equals(t));
	}

	public static boolean equalsto(String s, String t) {
		// TODO Auto-generated method stub
		if(s.length()!=t.length()) {
			return false;
		}
		
		int i =0;
		int j =0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)!=t.charAt(j)) {
				return false;
			}
			i++;
			j++;
		}
		
		return true;
	}

}
