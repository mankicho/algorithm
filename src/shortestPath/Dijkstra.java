package shortestPath;

import minCostExpansionTree.Node;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    private int[] distance;
    boolean[] visited;
    private int size;
    private int[][] graph;

    public Dijkstra(int[][] graph) {
        size = graph.length;
        distance = new int[size];
        this.graph = graph;
        visited = new boolean[size]; // 방문 노드를 표시하기위한 visited
    }

    public Dijkstra() {

    }

    public void dijkstra(int start) {
        distance = graph[start];
        visited[start] = true;

        for (int i = 0; i < size - 1; i++) {
            int minValue = extractIndex();
            visited[minValue] = true;
            for (int j = 0; j < size; j++) {
                if (graph[minValue][j] != Integer.MAX_VALUE && distance[j] > distance[minValue] + graph[minValue][j]) {
                    distance[j] = distance[minValue] + graph[minValue][j];
                }
            }

        }

        System.out.println(Arrays.toString(distance));
    }

    public int[] dijkstra(List<List<Node>> list, int start) {
        int num = list.size();
        int[] dis = new int[num];

        boolean[] visited = new boolean[num + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 1; i < dis.length; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        dis[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            int now = pq.poll().getE();

            if (visited[now]) {
                continue;
            }
            visited[now] = true;

            for (Node node : list.get(now)) {
                if (dis[node.getE()] > dis[now] + node.getV()) {
                    dis[node.getE()] = dis[now] + node.getV();
                    pq.add(new Node(node.getE(), dis[node.getE()]));
                }
            }
        }
        return dis;
    }

    private int extractIndex() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] != 0 && distance[i] < min) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }
}

