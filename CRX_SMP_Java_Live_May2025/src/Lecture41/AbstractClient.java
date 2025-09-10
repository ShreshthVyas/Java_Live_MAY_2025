package Lecture41;

public class AbstractClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDemo a =  new AbstractDemo() {

			@Override
			public void f() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void payment() {
				// TODO Auto-generated method stub
				System.out.println("COD");
			}
		
		};
		AbstractDemo a1 =  new AbstractDemo() {
			
			@Override
			public void f() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void payment() {
				// TODO Auto-generated method stub
				System.out.println("UPI");
			}
			
		};
	}

}
