package Lecture49;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Lecture48.PrimsMST;
import Lecture48.PrimsMST.primspair;

public class Djikstra {
	
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Djikstra(int v) {
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
	
	public class dpair{
		int v;
		String path;
		int cost;
		
		public dpair(int v, String path, int c){
			this.v = v;
			this.path = path;
			this.cost = c;
		}
		
		@Override
		public String toString() {
			return this.v + " " + this.path + " @ " + this.cost;
		}
		
	}
	
	public void djikstra() {
		PriorityQueue<dpair> pq = new PriorityQueue<>(new Comparator<dpair>() {

			@Override
			public int compare(dpair o1, dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost -o2.cost;
			}
			
		});
		HashSet<Integer>  vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			pq.add(new dpair(src, src+ "", 0));
			
			while(!pq.isEmpty()) {
				dpair rv =  pq.poll();
				
				if(vis.contains(rv.v)) {
					continue;
				}
				vis.add(rv.v);
				System.out.println(rv);
				
				for (Integer nbrs : graph.get(rv.v).keySet()) {
					int c =  graph.get(rv.v).get(nbrs) + rv.cost;
					if(!vis.contains(nbrs)) {
						pq.offer(new dpair(nbrs,rv.path + "==> " + nbrs , c));
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Djikstra g =  new Djikstra(7);
		g.addEdge(1, 2, 2);
		g.addEdge(1, 3, 3);
		g.addEdge(4, 3, 4);
		g.addEdge(4, 2, 6);
		g.addEdge(5, 2, 8);
		g.addEdge(5, 7, 1);
		g.addEdge(5, 6, 9);
		g.addEdge(7, 6, 1);
		
		g.djikstra();
	}
	
}
