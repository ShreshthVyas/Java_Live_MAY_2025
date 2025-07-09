package Lecture18;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "";
		StringBuilder sb = new StringBuilder("hello");
		long st = System.nanoTime();
		for (int i = 0; i < 1000; i++) {//O(N)
			sb.append(i);
		}
		long end = System.nanoTime();
		System.out.println(end-st);
		
		String s = "";
		long st1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {//O(N^2)
			s+=i;
		}
		long end1 = System.nanoTime();
		System.out.println(end1-st1);
		
		sb.charAt(0);
		
		sb.insert(1,'a');
		
		sb.deleteCharAt(0);
		sb.replace(0, 1, "s");
		sb.toString();
		
		sb.reverse();
		
		
	}

}
