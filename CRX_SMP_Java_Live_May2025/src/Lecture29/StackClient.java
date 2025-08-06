package Lecture29;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack st = new stack();
//		stack s = new stack(10);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		st.Display();
		System.out.println(st.peek());
		st.pop();
		st.push(200);
		st.pop();
		
		st.push(100);
		st.Display();
		
		System.out.println(st.size());
		
		
		
	}

}
