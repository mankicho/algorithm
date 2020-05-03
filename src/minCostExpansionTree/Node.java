package minCostExpansionTree;

public class Node implements Comparable<Node> {

    private int s; // 시작정점
    private int e; // 끝 정점
    private int v; // 가중치 비용

    public Node(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }


    @Override
    public int compareTo(Node o) {
        return o.v >= this.v ? -1 : 1;
    }

    public int getS() {
        return s;
    }

    public int getE() {
        return e;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return s + "," + e + "," + v;
    }
}
