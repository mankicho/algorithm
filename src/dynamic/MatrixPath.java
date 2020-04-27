package dynamic;

import java.util.Arrays;

// 행렬 경로문제
// (n,n) 에 도착하는 최고 점수
public class MatrixPath {
    private int col;
    private int row;

    private int[][] arr;

    public MatrixPath(int[][] source) {
        row = source.length + 1;
        col = source[0].length + 1;
        arr = new int[row][col];

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j] = source[i - 1][j - 1];
            }
        }

        System.out.println(Arrays.deepToString(arr));
        init();
        System.out.println(Arrays.deepToString(arr));
    }

    private void init() {
        for (int i = 0; i < col; i++) {
            arr[i][0] = 0;
        }

        for (int i = 0; i < row; i++) {
            arr[0][i] = 0;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                System.out.println("max(arr[" + i + "][" + j + "]" + "== >" + (arr[i][j] + max(arr[i - 1][j], arr[i][j - 1])));
                arr[i][j] = arr[i][j] + max(arr[i - 1][j], arr[i][j - 1]);
            }
        }
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    public int[][] getArr() {
        return arr;
    }
}
