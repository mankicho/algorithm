package union_find;

public class UnionFind {
    private int MAX_SIZE;
    private int[] root;

    public UnionFind(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        root = new int[MAX_SIZE];
        init();
    }

    private void init() {
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
    }

    // x 원소 찾기
    public int find(int x) {
        if (root[x] == x) {
            return x;
        } else {
            return find(root[x]);
        }
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);

        root[y] = x;
    }

    public void print() {
        for (int i = 0; i < root.length; i++) {
            System.out.println("root[" + i + "] ==> " + root[i]);
        }
    }
}
