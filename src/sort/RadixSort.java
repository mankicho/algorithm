package sort;

import java.util.*;

public class RadixSort {

    public static void radixSort(int[] arr) {
        int maxLength = maxSize(arr);
        int power = 1;
        int index = 0;
        List<Queue<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }

        for (int i = 1; i <= maxLength; i++) {

            for (int j = 0; j < arr.length; j++) {
                buckets.get((arr[j] / power) % 10).add(arr[j]);
            }

            for (int k = 0; k < 10; k++) {
                int bucketSize = buckets.get(k).size();

                if (!buckets.get(k).isEmpty()) {
                    for (int n = 0; n < bucketSize; n++) {
                        arr[index++] = buckets.get(k).poll();
                    }
                }
            }

            index = 0;
            power *= 10;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int maxSize(int[] arr) {
        int length = (int) (Math.log10((double) arr[0])) + 1;

        for (int i = 0; i < arr.length; i++) {
            int newLength = (int) (Math.log10((double) arr[i])) + 1;
            if (length < newLength) {
                length = newLength;
            }
        }

        return length;
    }

}
