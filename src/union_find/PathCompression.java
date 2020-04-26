package union_find;

public class PathCompression {
    private int MAX_LENGTH;
    private int[] rank;
    private int[] root;

    public PathCompression(int MAX_LENGTH) {
        this.MAX_LENGTH = MAX_LENGTH;
        rank = new int[MAX_LENGTH];
        root = new int[MAX_LENGTH];
        init();
    }

    private void init() {
        for (int i = 0; i < MAX_LENGTH; i++) {
            rank[i] = 0;
            root[i] = i;
        }
    }

//    public int find(int x) {
//        if (root[x] != x) {
//            root[x] = find(x);
//        } else {
//            return x;
//        }
//        return root[x];
//    }

    public int find(int x) {
        if (root[x] == x) {
            return x;
        } else {
            return root[x] = find(root[x]);
        }
    }

    public void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (rank[x] > rank[y]) {
            root[y] = x;
        } else {
            root[x] = y;
            if (rank[x] == rank[y]) {
                rank[y] += 1;
            }
        }
    }

    public void print() {
        for (int i = 0; i < root.length; i++) {
            System.out.println("root[" + i + "] ==> " + root[i]);
        }
    }
}
