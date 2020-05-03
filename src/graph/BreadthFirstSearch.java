package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    boolean[] visited;
    // 인접행렬
    Queue<int[]> queue;
    int[][] graph;
    int[] tmp;
    int size;

    // 리스트
    LinkedList[] linkedLists;

    public BreadthFirstSearch(int[][] graph, int size) {
        visited = new boolean[size];
        queue = new LinkedList<>();
        this.graph = graph;
        this.size = size;
        tmp = new int[size];
    }

    public BreadthFirstSearch(LinkedList[] linkedLists) {
        this.linkedLists = linkedLists;
    }

    public void bfs(int start) {
        visited[start] = true;
        queue.add(graph[start]);
        tmp[0] = start;
        int index = 1;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && !visited[i] && index < size) {
                    tmp[index++] = i;
                    queue.add(graph[i]);
                    visited[i] = true;
                }
            }
            System.out.println(Arrays.toString(visited));
        }
    }

    public void print() {
        System.out.println(Arrays.toString(tmp));
    }
}
