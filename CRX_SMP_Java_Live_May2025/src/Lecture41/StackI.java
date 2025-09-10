package Lecture41;

public interface StackI {
	
	public void push();
	public void pop();
	public void peek();
	
//	protected void f();
	
	//java 8
	static void f() {
		System.out.println();
	}
	default void f3() {
		
	}
	//java 9
	private void f1() {
		
	}
	
	public static void main(String[] args) {
		StackI.f();
	}
	
	
}
