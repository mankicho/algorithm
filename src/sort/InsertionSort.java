package sort;

/* 삽입 정렬
이미 정렬되어있는 i 개 짜리 배열에 하나의 원소를 더해서 i+1 개 짜리 배열을 만드는 과정을 반복
*/
//private static int[] arr = new int[]{8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int loc = i-1;
            int newItem = arr[i];

            while(loc >= 1 && newItem < arr[loc]){
                arr[loc+1] = arr[loc];
                loc--;
            }

            arr[loc+1] = newItem;
        }
    }
}
