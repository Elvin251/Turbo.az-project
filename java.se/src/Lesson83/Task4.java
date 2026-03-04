package Lesson83;

public class Task4 {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}