package Lecture48;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartite {

	public class pair {
		int v;
		int d;
	}

	public boolean isBipartite(int[][] graph) {
		Queue<pair> q =  new LinkedList<>();
		HashMap<Integer,Integer> visited =  new HashMap<>();
		
		for (int i = 0; i < graph.length; i++) {
			if(visited.containsKey(i)) {
				continue;
			}
			pair p =  new pair();
			p.v = i;
			p.d = 0;
			q.offer(p);// add src
			
			while(!q.isEmpty()) {
				pair rv = q.poll();//remove
				
				if(visited.containsKey(rv.v)) {//cycle is present
					if(visited.get(rv.v)!= rv.d) {//odd cycle
						return false;//graph is not bipartite
					}
					continue;
				}
				visited.put(rv.v, rv.d);//mark rv as visited
				
				//add neighbours
				for (int nbr : graph[rv.v]) {
					if(!visited.containsKey(nbr)) {//nbr not visted
						pair np =  new pair();
						np.v = nbr;
						np.d = rv.d+1;
						q.offer(np);
					}
				}
			}
		}
		return true;
		
	}
}
