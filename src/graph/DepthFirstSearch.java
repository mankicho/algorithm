package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {
    private int[][] graph;
    private boolean[] visited;
    private List<Integer> tmp = new ArrayList<>();

    public DepthFirstSearch(int[][] graph) {
        this.graph = graph;
        visited = new boolean[graph.length];
    }

    public void dfs(int start) {
        visited[start] = true;
        tmp.add(start);
        for (int i = 0; i < graph[start].length; i++) {
            if (!visited[i]) {
                aDFS(i);
            }
        }
    }

    private void aDFS(int node) {
        visited[node] = true;
        tmp.add(node);
        for (int i = 0; i < graph[node].length; i++) {
            if (!visited[i] && graph[node][i] != 0) {
                aDFS(i);
            }
        }
    }

    public void print() {
        System.out.println(tmp);
    }
}
