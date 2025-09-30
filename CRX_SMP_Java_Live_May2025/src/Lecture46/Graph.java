package Lecture46;
import java.util.HashMap;
import java.util.HashSet;
public class Graph {
	
	private HashMap<Integer, HashMap<Integer,Integer>> graph;
	
	public Graph(int v) {
		graph =  new HashMap<>();
		
		for (int i = 1; i <=v; i++) {
			graph.put(i,new HashMap<>());
		}
	}
	//O(1)
	public void addEdge(int v1, int v2,int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	
	//O(1)
	public void addvertice(int v) {
		graph.put(v,new HashMap<>());
	}
	
	public void removeedge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	public boolean containsedge(int v1,int v2) {
		return graph.get(v1).containsKey(v2);
	}
	
	public boolean containsvertice(int v) {
		return graph.containsKey(v);
	}
	
	public void removeVertice(int v) {
		
		for (int i : graph.get(v).keySet()) {
			graph.get(i).remove(v);
		}
		graph.remove(v);
	}
	
	public void Display() {
		
		for (Integer v : graph.keySet()) {//get all v one by one
			System.out.print(v + " ==>");
			System.out.println(graph.get(v));
		}
	}
	
	public boolean hasPath(int src,int dest,HashSet<Integer> visited) {
		if(src == dest) {
			return true;
		}
		visited.add(src);//avoid deadlock
		for (Integer nbrs : graph.get(src).keySet()) {//to get nbrs of the source
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, dest,visited);
				if(ans) {
					return true;
				}
			}
		}
		visited.remove(src);
		return false;
		
	}
	
	public void PrintAllPath(int src,int dest,HashSet<Integer> visited,String s) {
		if(src == dest) {
			System.out.println(s);
			return ;
		}
		
		visited.add(src);//avoid deadlock
		for (Integer nbrs : graph.get(src).keySet()) {//to get nbrs of the source
			if(!visited.contains(nbrs)) {
				PrintAllPath(nbrs, dest,visited,s+"==>"+ nbrs);
			}
		}
		visited.remove(src);
		
	}
	
}


