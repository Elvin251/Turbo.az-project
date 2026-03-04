package lesson82;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int n = 2;
        int k = 3;

        int len = arr.length - n;
        k = k % len;

        for (int t = 0; t < k; t++) {

            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > n; i--) {
                arr[i] = arr[i - 1];
            }

            arr[n] = last;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}