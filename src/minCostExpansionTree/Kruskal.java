package minCostExpansionTree;

import java.util.PriorityQueue;

// 사이클을 만들지 않으면서 최소 비용 간선을 하나씩 더해가는것
public class Kruskal {
    private int[] parent;
    private PriorityQueue<Node> queue;

    public Kruskal(int[][] graph) {
        queue = new PriorityQueue<>();

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 0 || graph[i][j] == Integer.MAX_VALUE) {
                    continue;
                }
                queue.add(new Node(i, j, graph[i][j]));
            }
        }
        parent = new int[graph.length];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

    }

    private int find(int a) {
        if (a == parent[a]) {
            return a;
        }
        parent[a] = find(parent[a]);
        return parent[a];
    }

    private void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        if (aRoot != bRoot) {
            parent[aRoot] = b;
        } else {
            return;
        }
    }

    public void kruskal() {
        int result = 0;
        while (!queue.isEmpty()) {
            Node pollNode = queue.poll();
            int s = pollNode.getS();
            int e = pollNode.getE();
            int v = pollNode.getV();

            int a = find(s);
            int b = find(e);

            if (a == b) {
                continue;
            }
            System.out.println(pollNode);

            union(a, b);
            result += v;
        }

        System.out.println("result = " + result);
    }


}
