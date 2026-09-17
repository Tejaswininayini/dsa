package Demo;

import java.util.*;

public class DFSStack {
	
	
	    static void dfs(
	            ArrayList<ArrayList<Integer>> graph,
	            int current,
	            boolean[] visited) {

	        visited[current] = true;

	        System.out.println(current + " ");

	        for (int neighbour : graph.get(current)) {

	            if (!visited[neighbour]) {

	                dfs(graph, neighbour, visited);
	            }
	        }
	    }

	    public static void main(String[] args) {

	        ArrayList<ArrayList<Integer>> graph =
	                new ArrayList<>();

	        // Add vertices
	        for (int i = 0; i < 5; i++) {
	            graph.add(new ArrayList<>());
	        }

	        // Add edges
	        graph.get(0).add(1);
	        graph.get(0).add(2);

	        graph.get(1).add(3);

	        graph.get(2).add(4);

	        boolean[] visited =
	                new boolean[graph.size()];

	        dfs(graph, 0, visited);
	    }
	}
			
	
	
	
	


