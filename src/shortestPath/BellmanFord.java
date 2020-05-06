package shortestPath;

import minCostExpansionTree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class BellmanFord {
    public static final int INF = Integer.MAX_VALUE;

    public static void solve(int[][] adj, int start) {
        int num = adj.length;
        int[] dists = new int[num];
        Arrays.fill(dists, INF);
        dists[start] = 0;

        for (int v = 0; v < num; ++v) {
            for (int w = 0; w < num; ++w) {
                if (adj[v][w] != INF)
                    dists[w] = Math.min(dists[w], dists[v] + adj[v][w]);
            }
        }

        for (int i = 0; i < num; ++i)
            System.out.println(dists[i]);
    }

    public static List<Integer> solve(List<List<Node>> lists, int start) {
        int num = lists.size();

        List<Integer> upper = new ArrayList<Integer>();
        upper.add(0);
        for (int i = 1; i < num; i++) {
            upper.add(Integer.MAX_VALUE);
        }
        upper.set(start, 0);
        boolean updated = false; // V번 순회한다.
        for (int i = 1; i < num; i++) {
            updated = false;
            for (int here = 1; here < num; here++) {
                for (int j = 1; j < lists.get(here).size(); j++) {
                    int there = lists.get(here).get(j).getE();
                    int cost = lists.get(here).get(j).getV(); // (here, there) 간선을 따라 완화를 시도한다.
                    if (upper.get(there) > upper.get(here) + cost) { // 성공
                        upper.set(there, upper.get(here) + cost);
                        updated = true;
                    }
                } // 모든 간선에 대해 완화가 실패했을 경우 V-1번도 돌 필요 없이 곧장 종료.
                if (!updated) break;
            }

        }
        // V번째 순회에서도 완화가 성공했다면 음수 사이클이 있다.
        if (updated) upper.clear();
        return upper;

    }
}