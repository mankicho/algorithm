import sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // SelectionSort
        int[] arr = new int[]{8,31,48,73,3,65,20,29,11,15};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
