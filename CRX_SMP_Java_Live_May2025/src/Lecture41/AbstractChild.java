package Lecture41;

public class AbstractChild extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild a = new AbstractChild();
		a.f();
		a.payment();
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("F in  child");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("UPI");
	}

}
