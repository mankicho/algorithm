package minCostExpansionTree;

import union_find.UnionFind;

// 사이클을 만들지 않으면서 최소 비용 간선을 하나씩 더해가는것
public class Kruskal {
    private int[][] graph;
    private int[][] result;
    
    public Kruskal(int[][] graph) {
        this.graph = graph;
        result = new int[2][graph.length];
    }

    public void kruskcal() {
        int min = Integer.MAX_VALUE;
        int relationLine = 0;

        while (relationLine < graph.length) {
            int row = 0;
            int col = 0;
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[j].length; j++) {
                    if (graph[i][j] == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (graph[i][j] <= min) {
                        min = graph[i][j];
                        row = i;
                        col = j;
                    }
                }
            }
            result[0][relationLine] = row;
            result[1][relationLine] = col;

            relationLine++;
        }
    }
}
