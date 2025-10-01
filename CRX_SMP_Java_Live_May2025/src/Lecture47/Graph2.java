package Lecture47;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
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

	public void Display() {

		for (Integer v : graph.keySet()) {// get all v one by one
			System.out.print(v + " ==>");
			System.out.println(graph.get(v));
		}
	}
	
	public boolean bfs(int src, int dest, HashSet<Integer> vis) {
		if(src == dest) {
			return true;
		}
		Queue<Integer> q = new  LinkedList<>();
		q.add(src);//add src
		
		while(!q.isEmpty()) {
			int rv = q.remove();//remove 
			
			if(rv == dest) {
				return true;//path found
			}
			if(vis.contains(rv)) {// already visited , avoids deadlock
				continue;
			}
//			System.out.println(rv);
			vis.add(rv);//mark visited
			
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.offer(nbrs);//add neighbour if not visited
				}
			}
		}
		return false;
		
	}
	public boolean dfs(int src, int dest, HashSet<Integer> vis) {
		if(src == dest) {
			return true;
		}
		Stack<Integer> q = new Stack<>();
		q.add(src);//add src
		
		while(!q.isEmpty()) {
			int rv = q.pop();//remove 
			
			if(rv == dest) {
				return true;//path found
			}
			if(vis.contains(rv)) {// already visited , avoids deadlock
				continue;
			}
			vis.add(rv);//mark visited
			
			for (Integer nbrs : graph.get(rv).keySet()) {
				if(!vis.contains(nbrs)) {
					q.push(nbrs);//add neighbour if not visited
				}
			}
		}
		return false;
		
	}
	
	public void bft() {
		Queue<Integer> q = new  LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.remove();//remove 
				
				if(vis.contains(rv)) {// already visited , avoids deadlock
					continue;
				}

				vis.add(rv);//mark visited
				System.out.print(rv+" ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);//add neighbour if not visited
					}
				}
			}
		}
		System.out.println();
	}
	public void dft() {
		Stack<Integer> q = new  Stack<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.pop();//remove 
				
				if(vis.contains(rv)) {// already visited , avoids deadlock
					continue;
				}
				
				vis.add(rv);//mark visited
				System.out.print(rv+" ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.push(nbrs);//add neighbour if not visited
					}
				}
			}
		}
	}
	
	public boolean isCyclic() {
		Queue<Integer> q = new  LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				int rv = q.remove();//remove 
				
				if(vis.contains(rv)) {// already visited -- Cycle present
					return true;
				}
				vis.add(rv);//mark visited
				
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);//add neighbour if not visited
					}
				}
			}
		}
		return false;
	}
	
	public boolean isConnected() {
		Queue<Integer> q = new  LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count =0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			count++;
			while(!q.isEmpty()) {
				int rv = q.remove();//remove 
				
				if(vis.contains(rv)) {// already visited , avoids deadlock
					continue;
				}

				vis.add(rv);//mark visited
				
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);//add neighbour if not visited
					}
				}
			}
		}
		System.out.println(count);
		return count == 1;
	}
	
	public boolean isTree() {// return isConnected() && !isCyclic()
		Queue<Integer> q = new  LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count =0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);
			count++;
			while(!q.isEmpty()) {
				int rv = q.remove();//remove 
				
				if(vis.contains(rv)) {// already visited , avoids deadlock
					return false;// not a tree
				}

				vis.add(rv);//mark visited
				
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);//add neighbour if not visited
					}
				}
			}
		}
		
		return count == 1;
	}

}
