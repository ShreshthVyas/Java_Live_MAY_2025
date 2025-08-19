package Lecture32;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20,30);
		add(10,20.5,30);
		
		add(20,30.9,10,20,30,50,60,70);
		
	}
	private static void add(int a , double d,int...args ) {
		int arr[] =  args;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}

	private static void add(int i, double d, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+d+k);
	}

	private static void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}

}
