package Lecture22;

public class KeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kp[] = {"" , "abc" ,"def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wx" ,"yz"};
		String ques = "12";
		keypad(ques,"",kp);
	}

	public static void keypad(String ques, String ans, String[] kp) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String temp = kp[ch-'0'];
		
		for (int i = 0; i < temp.length(); i++) {
			keypad(ques.substring(1), ans+temp.charAt(i), kp);
		}
	}

}
