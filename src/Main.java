import dynamic.Fibonacci;
import dynamic.LongestCommonSubsequence;
import dynamic.MatrixPath;
import dynamic.StoneLaying;
import graph.BreadthFirstSearch;
import graph.DepthFirstSearch;
import minCostExpansionTree.Kruskal;
import minCostExpansionTree.Prim;
import sort.*;
import union_find.PathCompression;
import union_find.RankUnionFind;
import union_find.UnionFind;

import java.util.*;

public class Main {

    private static int[] arr = new int[]{8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

    public static void main(String[] args) {

        // selectionSort
//        SelectionSort.selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

        // bubbleSort
//        BubbleSort.bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        // insertionSort
//        InsertionSort.insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        // mergeSort
//        MergeSort.mergeSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        // quickSort
//        QuickSort.quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        // heapSort
//        HeapSort.buildHeap(arr);
//        System.out.println(Arrays.toString(arr));

        // radixSort
//        RadixSort.radixSort(arr);
//        System.out.println(Arrays.toString(arr));

        // countingSort
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        arr = CountingSort.countSort(arr, max);
//        System.out.println(Arrays.toString(arr));

//        PathCompression pathCompression = new PathCompression(8);
//        pathCompression.union(1, 3);
//        pathCompression.union(7, 6);
//        pathCompression.union(7, 1);
//        pathCompression.union(3, 7);
//        pathCompression.union(4, 2);
//        pathCompression.union(1, 1);
//
//        pathCompression.print();
//
//        List<int[][]> tmp = new ArrayList<>();
//        tmp.add(new int[20][1]);
//        tmp.add(new int[1][30]);
//        tmp.add(new int[30][10]);
//        tmp.add(new int[10][10]);
//
//        StoneLaying laying = new StoneLaying(tmp);
//
//        System.out.println(laying.getMin()[0][3]);

//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        String str1 = "abacacbbbacb";
//        String str2 = "abacacbbcbacab";
//
//        LongestCommonSubsequence lcs = new LongestCommonSubsequence(str1, str2);
//        System.out.println(lcs.lcs(str1.length() - 1, str2.length() - 1));
//

        int[][] graph = {{0, 6, 7, Integer.MAX_VALUE, 10, 9},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 5, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 3, 11},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 11},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0},};

        Kruskal k = new Kruskal(graph);
        k.kruskal();
    }
}
