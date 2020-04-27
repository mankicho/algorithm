package dynamic;

public class Fibonacci {

    private int[] arr;
    private int size;

    public Fibonacci(int size) {
        this.size = size;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public int fibonacci(int n) {
        if (arr[n] != 0) {
            return arr[n];
        } else {
            if (n == 1 || n == 0) {
                arr[n] = 1;
            } else {
                arr[n] = fibonacci(n-1) + fibonacci(n-2);
            }
            return arr[n];
        }
    }
}
