package Lecture47;

import java.util.HashSet;

public class Graph2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph2 g = new Graph2(7);
		g.addEdge(1, 2, 10);
		g.addEdge(1, 3, 30);
//		g.addEdge(4, 3, 40);
//		g.addEdge(4, 2, 60);
//		g.addEdge(5, 2, 80);
		g.addEdge(5, 7, 100);
		g.addEdge(5, 6, 90);
		g.addEdge(7, 6, 110);
		
//		System.out.println(g.bfs(1, 7, new HashSet<>()));
//		g.bft();
//		g.dft();
		
		//System.out.println(g.isCyclic());
		System.out.println(g.isConnected());
	}

}
