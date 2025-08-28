package Lecture35;

public class CycleRemovalClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleRemoval ll = new CycleRemoval();
		ll.addFirst(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
	
		ll.createCycle(2);
		ll.FloydCycleRemoval();
		ll.Display();
		
	}
}
