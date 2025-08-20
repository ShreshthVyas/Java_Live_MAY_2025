package Lecture33;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l = new LL();
		l.addFirst(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.addFirst(5);
		System.out.println(l.getMiddle());
		l.Display();
//		l.addAtIdx(3, 200);
//		l.Display();
//		l.removeAtIdx(3);
//		l.removeFirst();
//		l.removeLast();
//		l.Display();
		
	}

}
