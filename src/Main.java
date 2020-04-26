import sort.*;
import union_find.PathCompression;
import union_find.RankUnionFind;
import union_find.UnionFind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

        PathCompression pathCompression = new PathCompression(8);
        pathCompression.union(1, 3);
        pathCompression.union(7, 6);
        pathCompression.union(7, 1);
        pathCompression.union(3, 7);
        pathCompression.union(4, 2);
        pathCompression.union(1, 1);

        pathCompression.print();
    }
}
