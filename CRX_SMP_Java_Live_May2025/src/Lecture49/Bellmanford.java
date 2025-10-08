package Lecture49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bellmanford {
	
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Bellmanford(int v) {
		graph =  new HashMap<>();
		
		for (int i = 1; i <=v; i++) {
			graph.put(i,new HashMap<>());
		}
	}

	// O(1)
	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
//		graph.get(v2).put(v1, w);
	}

	// O(1)
	public void addvertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public class edgepairs{
		int v1;
		int v2;
		int c;
		public edgepairs(int v1, int v2 , int c){
			this.v1 = v1;
			this.v2 = v2;
			this.c = c;
		}
		
		@Override
		public String toString() {
			return this.v1 + " " + this.v2 + " @ " + this.c;
		}
	}
	
	public List<edgepairs> getedges(){
		
		List<edgepairs> list =  new ArrayList<>();
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				list.add(new edgepairs(v1, v2, graph.get(v1).get(v2)));
			}
		}
		
		return list;
		
	}
	
	public void bmf() {
		int v = graph.size();
		int arr[] = new int[v+1];
		List<edgepairs> list = getedges();
		for (edgepairs e : list) {
			System.out.println(e);
		}
		for (int i = 2; i < arr.length; i++) {
			arr[i] = 9999999;// Note: Integer.MAX_VALUE will result in overflow 
		}
		for (int i = 1; i <=v; i++) {// relax all edges from vertice i
			for (edgepairs e : list) {
				
				if(i==v && arr[e.v2]> arr[e.v1]+ e.c) {//-ve cycle present
					System.out.println("-ve cycle");
					return;
				}
				if(arr[e.v2]> arr[e.v1]+ e.c) {//relaxation will take place
					arr[e.v2] = arr[e.v1]+ e.c;
				}
			}	
		}
		
		for (int i = 1; i < arr.length; i++) {
			System.out.println(i + " " + arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Bellmanford g = new Bellmanford(3);
//		g.addEdge(1, 2, 2);
//		g.addEdge(1, 3, 6);
//		g.addEdge(1, 4, -1);
//		g.addEdge(2, 5, 3);
//		g.addEdge(5, 4, 4);
//		g.addEdge(4, 3, -2);
		g.addEdge(1, 2, -1);
		g.addEdge(2, 3, -2);
		g.addEdge(3, 1, 6);
		
		g.bmf();
	}
}
