package minCostExpansionTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 그래프에서 간선을 정점-1개만 남겨 트리가 되도록 만든것. DFS,BFS 도 신장트리의 한 종류
// 프림알고리즘은 공집합에서 시작하여 모든 정점을 포함할때까지 늘려나간다.
public class Prim {
    private int[][] graph;
    private int[][] nodeSet; // 결과를 담아둘 배열
    private int[] distance; // 가중치를 담아둘 배열
    private int[] from; // 어느 정점에서 시작한건지 담아둘 배열
    private int size;

    public Prim(int[][] graph) {
        this.graph = graph;
        size = graph.length;
        distance = new int[size];
        nodeSet = new int[2][size - 1];
        from = new int[size];
    }

    public void prim(int start) {
        // 모든 정점간의 거리를 무한대로 초기화(예시에서는 int 의 최대값인 2^32, 대략 10억정도)
        for (int i = 0; i < from.length; i++) {
            from[i] = start;
            distance[i] = graph[start][i];
        }

        for (int i = 0; i < nodeSet[0].length; i++) {
            int minValue = minValueIndex(); // 가중치 배열에서 가장 작은값을 가진 index 를 반환
            nodeSet[0][i] = from[minValue]; // 반환 받은 값 minValue 의 이전 정점
            nodeSet[1][i] = minValue; // 반환 받은 정점
            distance[minValue] = 0; // 해당 정점의 가중치를 0으로 초기화 == 현재 정점은 minValue
            for (int j = 1; j < size; j++) {
                if (graph[minValue][j] < distance[j]) { // 원래의 가중치와 비교해봤을때 distance 의 값이 더 크면
                    from[j] = minValue; // 이전 정점을 minValue 로 바꾸고
                    distance[j] = graph[minValue][j]; // 가중치 초기화
                }
            }
        }
    }

    private int minValueIndex() { // 가중치 배열에서 가장 작은값의 index 를 리턴

        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == 0) {
                continue;
            }

            if (distance[i] < min) {
                min = distance[i];
                index = i;
            }
        }

        System.out.println("index = " + index);
        return index;
    }

    public void print() {
        for (int i = 0; i < nodeSet[0].length; i++) {
            System.out.print(nodeSet[0][i] + " ~ ");
            System.out.println(nodeSet[1][i]);
        }
    }
}
