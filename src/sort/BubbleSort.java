package sort;
//private static int[] arr = new int[]{8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

// 버블 정렬
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
