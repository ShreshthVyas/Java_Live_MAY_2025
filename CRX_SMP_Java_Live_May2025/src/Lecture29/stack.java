package Lecture29;

public class stack {

	private int arr[];
	private int top =-1;
	
	public stack() {
		this.arr = new int[5];
		
	}
	public stack(int size) {
		this.arr= new int[size];
	}
	
	public boolean isEmpty() {//O(1)
		return top == -1;
	}
	
	public boolean isFull() {//O(1)
		return top == arr.length-1;
	}
	
	public void push(int x) throws Exception {//O(1)
		if(isFull()) {
			throw new Exception("Stack is Already Full");
		}
		this.top++;
		this.arr[top] = x;
	}
	
	public int pop() throws Exception {//O(1)
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = this.arr[top];
		this.arr[top] = 0;
		this.top--;
		return temp;
	}
	
	public int peek() throws Exception {//O(1)
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.arr[this.top];
	}
	
	public int size() {//O(1)
		return this.top+1;
	}
	
	public void Display() {
		for (int i = top; i>=0; i--) {
			System.out.print(this.arr[i]+ "  ");
		}
		System.out.println();
	}
	
	
	
	
	
}
