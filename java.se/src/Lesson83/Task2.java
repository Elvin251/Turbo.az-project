package Lesson83;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5, 6, 7, 8};

        int cut = 0;
        int tek = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                cut++;
            } else {
                tek++;
            }
        }

        System.out.println("Cut: " + cut);
        System.out.println("Tek: " + tek);
    }
}