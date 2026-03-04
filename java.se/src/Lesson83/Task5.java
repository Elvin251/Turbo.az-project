package Lesson83;

public class Task5 {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int ferq = max - min;

        System.out.println("Ferq: " + ferq);
    }
}