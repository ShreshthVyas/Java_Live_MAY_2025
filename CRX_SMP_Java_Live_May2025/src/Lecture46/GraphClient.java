package Lecture46;

import java.util.HashSet;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 30);
		g.addEdge(4, 3, 40);
		g.addEdge(4, 2, 60);
		g.addEdge(5, 2, 80);
		g.addEdge(5, 7, 100);
		g.addEdge(5, 6, 90);
		g.addEdge(7, 6, 110);
		
//		g.Display();
//		System.out.println(g.containsedge(7, 1));
//		System.out.println(g.containsvertice(1));
//		
//		g.removeedge(6, 7);
//		g.removeVertice(1);
//		
//		g.Display();
		
//		boolean ans = g.hasPath(1, 7,new HashSet<>());
//		System.out.println(ans);
		
		g.PrintAllPath(1, 7, new HashSet<Integer>(),1+ "");
		
	}

}
