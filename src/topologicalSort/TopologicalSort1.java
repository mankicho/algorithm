package topologicalSort;

import minCostExpansionTree.Node;

import java.util.*;

// 진입 간선이 없는 정점 선택
// 정점과 정점의 진출 간선을 모두 제거
public class TopologicalSort1 {
    private int[] result;
    private LinkedList<Node>[] nodes;

    public TopologicalSort1(int size) {
        result = new int[size];
        nodes = new LinkedList[size];
    }

    public void add(int s, int e, String str) {
        nodes[s].add(new Node(e, str));
    }
}
