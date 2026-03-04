package lesson82;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 1};

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}