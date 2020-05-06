package minCostExpansionTree;

public class Node implements Comparable<Node> {

    private int s;
    private int e; // 끝 정점
    private int v; // 가중치 비용

    private String str;

    public Node(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }

    public Node(int e, int v) {
        this.e = e;
        this.v = v;
    }

    public Node(int e, String str) {
        this.e = e;
        this.str = str;
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
        return e + "," + v;
    }
}
