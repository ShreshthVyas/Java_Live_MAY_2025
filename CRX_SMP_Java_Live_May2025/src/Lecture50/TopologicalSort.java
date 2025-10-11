package Lecture50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
	
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public TopologicalSort(int v) {
		graph =  new HashMap<>();
		
		for (int i = 0; i <v; i++) {
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
	
	public int[] getindegree() {
		int in[] =  new int[graph.size()];
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				in[v2]++; // edge from v1 to v2 increases v2's indegree by 1
			}
		}
		
		return in;
	}
	
	public void toposort() {
		int arr[] = getindegree();
		Queue<Integer> q =  new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int rv =  q.remove();
			System.out.print(rv + " ");
			
			for (int nbrs : graph.get(rv).keySet()) {
				arr[nbrs]--;// remove or relax edge from rv to nbr
				if(arr[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		TopologicalSort g =  new TopologicalSort(6);
		g.addEdge(0, 1, 0);
		g.addEdge(0, 2, 0);
		g.addEdge(1, 3, 0);
		g.addEdge(5, 2, 0);
		g.addEdge(5, 4, 0);
		g.addEdge(3, 4, 0);
		
		g.toposort();
	}
}
