package graph;

import minCostExpansionTree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StrongConnection {
    private boolean[] visit;
    private boolean[] reVisit;
    private List<Node>[] lists;
    private List<Node>[] reLists;
    private Stack<Integer> stack = new Stack<>();
    private List<List<Integer>> sccList = new ArrayList<>();
    private List<Integer> ans = new ArrayList<>();

    public StrongConnection(List<Node>[] lists, List<Node>[] reLists) {
        this.lists = lists;
        this.reLists = reLists;
        visit = new boolean[lists.length];
        reVisit = new boolean[lists.length];

        System.out.println(Arrays.deepToString(lists));
        dfs(1);
    }

    private void dfs(int start) {
        visit[start] = true;
        for (Node node : lists[start]) {
            if (visit[node.getE()]) {
                continue;
            }
            dfs(node.getE());
        }
        stack.add(start);
    }

    private void scc(int start) {
        ans.add(start);
        reVisit[start] = true;

        for (Node node : reLists[start]) {
            if (reVisit[node.getE()]) {
                continue;
            }
            scc(node.getE());
        }
    }

    public void print() {
        while (!stack.isEmpty()) {
            ans = new ArrayList<>();
            int n = stack.pop();
            System.out.println("n = " + n);
            if (!reVisit[n]) {
                scc(n);
                if (ans.size() > 0) {
                    sccList.add(ans);
                }
            }
            System.out.println(ans);
        }

        for(List<Integer> list : sccList){
            System.out.println(list);
        }
    }
}
