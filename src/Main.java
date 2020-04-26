import sort.BubbleSort;
import sort.SelectionSort;

import java.util.Arrays;

public class Main {

    private static int[] arr = new int[]{8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

    public static void main(String[] args) {

        // selectionSort
//        SelectionSort.selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

        // bubbleSort
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
