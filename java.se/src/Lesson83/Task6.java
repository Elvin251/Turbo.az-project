package Lesson83;

public class Task6 {

    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -7, 9, -1};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                count++;
            }
        }

        System.out.println("Neqativ ededlerin sayi: " + count);
    }
}