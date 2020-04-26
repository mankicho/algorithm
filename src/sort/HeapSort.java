package sort;

// 힙 정렬

import java.util.Arrays;

public class HeapSort {

    public static void buildHeap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            heapify(arr, i, arr.length);
        } // 여기까지 힙 만들기

        int length = arr.length;


    }

    public static void heapify(int[] arr, int parent, int length) {
        int left = 2 * parent + 1;
        int right = left + 1;


        int smaller = 0;
        // 작은 자식 고르기
        if (right <= length - 1) {
            if (arr[left] < arr[right]) {
                smaller = left;
            } else {
                smaller = right;
            }
        } else if (left <= length - 1) {
            smaller = left;
        } else {
            return;
        }

        while (arr[smaller] < arr[parent]) {
            int tmp = arr[smaller];
            arr[smaller] = arr[parent];
            arr[parent] = tmp;
            smaller = parent;
            parent /= 2;
        }
    }
}
