package datastructure_graphalgorithm;

import java.util.*;

public class GraphAlgorithm {
    private int V;
  private LinkedList<Integer> adj[];

  // Create a graph
  GraphAlgorithm(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Add edges to the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // BFS algorithm
  void BFS(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
  void DFS(int vertex) {
    boolean visited[] = new boolean[V];
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adj[vertex].listIterator();
    while (ite.hasNext()) {
      int nx = ite.next();
      if (!visited[nx])
        DFS(nx);
    }
  }
  
}
