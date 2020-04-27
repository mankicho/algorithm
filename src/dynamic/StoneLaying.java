package dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoneLaying {

    private List<int[][]> list = new ArrayList<>();
    private int[] distance;
    private int[][] min;

    public StoneLaying(List<int[][]> source) {
        list = source;
        distance = new int[list.size() + 1];
        min = new int[list.size()+1][list.size()+1];
        for (int i = 0; i < list.size(); i++) {
            int row = list.get(i).length;
            int col = list.get(i)[0].length;

            distance[i] = row;
            distance[i + 1] = col;
        }
        System.out.println(Arrays.toString(distance));
        matrixChain(list.size());
    }

    private void matrixChain(int n) {
        for (int r = 0; r < n; r++) {
            for (int i = 0; i < n - i; i++) {
                int j = i + r;
                if (j == i) {
                    min[i][j] = 0;
                    continue;
                }
                min[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    min[i][j] = minValue(min[i][j], min[i][k] + min[k + 1][j] + distance[i - 1] * distance[k] * distance[j]);
                }
            }
        }

        Arrays.sort(min);
    }

    private int minValue(int a, int b) {
        return a > b ? a : b;
    }

    public int[][] getMin() {
        return min;
    }
}
