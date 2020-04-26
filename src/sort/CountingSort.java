package sort;

public class CountingSort {

    public static int[] countSort(int[] input, int max) {
        int[] sorted = new int[input.length];
        int[] tmp = new int[max + 1];

        for (int i = 0; i < input.length; i++) {
            tmp[input[i]]++;
        }

        int idx = 0;
        for (int i = 1; i <= max; i++) {
            if (tmp[i] == 0) {
                continue;
            }

            while (tmp[i] != 0) {
                sorted[idx++] = i;
                tmp[i]--;
            }
        }

        return sorted;
    }
}
