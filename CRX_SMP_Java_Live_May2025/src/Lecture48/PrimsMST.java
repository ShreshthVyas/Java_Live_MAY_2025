package Lecture48;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsMST {


	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public PrimsMST(int v) {
		graph =  new HashMap<>();
		
		for (int i = 1; i <=v; i++) {
			graph.put(i,new HashMap<>());
		}
	}

	// O(1)
	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}

	// O(1)
	public void addvertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public class primspair{
		int v;
		int aqv;
		int c;
		
		public primspair(int v, int aqv, int c){
			this.v = v;
			this.aqv = aqv;
			this.c = c;
		}
		
		@Override
		public String toString() {
			return this.v + " " + this.aqv + " @ " + this.c;
		}
		
	}
	
	public int MST() {
		PriorityQueue<primspair> pq =  new PriorityQueue<>(new Comparator<primspair>() {

			@Override
			public int compare(primspair o1, primspair o2) {
				// TODO Auto-generated method stub
				return o1.c - o2.c;
			}
		});
		HashSet<Integer> vis =  new HashSet<>();
		
		int mst = 0;
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			pq.add(new primspair(src, src, 0));
			while(!pq.isEmpty()) {
				primspair rv = pq.remove();//remove 
				
				if(vis.contains(rv.v)) {// already visited , avoids deadlock
					continue;
				}

				vis.add(rv.v);//mark visited
				mst+= rv.c;
				System.out.println(rv);
				for (Integer nbrs : graph.get(rv.v).keySet()) {
					int c =  graph.get(rv.v).get(nbrs);
					if(!vis.contains(nbrs)) {
						pq.offer(new primspair(nbrs, rv.v, c));
					}
				}
			}
		}
		return mst;
	}
	
	public static void main(String[] args) {
		PrimsMST g =  new PrimsMST(7);
		g.addEdge(1, 2, -10);
		g.addEdge(1, 3, 30);
		g.addEdge(4, 3, 40);
		g.addEdge(4, 2, -60);
		g.addEdge(5, 2, 80);
		g.addEdge(5, 7, 100);
		g.addEdge(5, 6, 90);
		g.addEdge(7, 6, -110);
		
		System.out.println(g.MST());
	}
	

}
