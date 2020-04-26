package sort;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int q = partition(arr, start, end);
            quickSort(arr, start, q - 1);
            quickSort(arr, q + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        System.out.println("??1");
        int criteria = (start + end) / 2;
        int left = start;
        int right = end;
        int tmp = arr[criteria];
        while (left < right) {

            while ((arr[left] < arr[criteria]) && (left < right)) {
                left++;
            }

            System.out.println("left = " + left);
            while ((arr[right] > arr[criteria]) && (left < right)) {
                right--;
            }
            System.out.println("right = " + right);

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        int criLocation = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tmp) {
                criLocation = i;
                break;
            }
        }
        return criLocation;
    }
}
