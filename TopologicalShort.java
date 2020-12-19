package datastructure_graphalgorithm;

import java.util.*;

public class TopologicalShort {
     private int V;
    private LinkedList<Integer> adj[]; 
  
    //Constructor 
    TopologicalShort(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) { adj[v].add(w); } 
  
    // A recursive function used by topologicalSort 
    void topologicalSortUtil(int v, boolean visited[], 
                             Stack stack) 
    { 
        // Mark the current node as visited. 
        visited[v] = true; 
        Integer i; 
  
        // Recur for all the vertices adjacent to this 
        // vertex 
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
            if (!visited[i]) 
                topologicalSortUtil(i, visited, stack); 
        } 
  
        // Push current vertex to stack which stores result 
        stack.push(new Integer(v)); 
    } 
    void topologicalSort() 
    { 
        Stack stack = new Stack(); 
        boolean visited[] = new boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, stack); 
  
        // Print contents of stack 
        while (stack.empty()==false) 
            System.out.print(stack.pop() + " "); 
    } 
}
