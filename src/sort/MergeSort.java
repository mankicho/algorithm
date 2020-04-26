package sort;

import java.util.Arrays;

// 병합정렬
/*
병합 정렬은 입력을 반으로 나눈다, 이렇게 전반부, 후반부를 독립적으로 정렬한다. 마지막으로 정렬된 두 부분을
합쳐서, 즉 병합해서 정렬된 배열을 얻는다
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int medium = (start + end) / 2;
            mergeSort(arr, start, medium);
            mergeSort(arr, medium + 1, end);
            merge(arr, start, medium, end);
        }
    }

    public static void merge(int[] arr, int start, int medium, int end) {
        int i = start;
        int j = medium + 1;
        int t = 0;

        int[] tmp = new int[arr.length];

        while (i <= medium && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= medium) {
            tmp[t++] = arr[i++];
        }

        while (j <= end) {
            tmp[t++] = arr[j++];
        }

        i = start;
        t = 0;

        while (i <= end) {
            arr[i++] = tmp[t++];
        }

        System.out.println("arr => " + Arrays.toString(arr));
    }

}
