package Lesson83;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        System.out.println("2-ci boyuk eded: " + second);
    }
}