package Lesson83;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 1, 5};

        int target = 2;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Index: " + i);
                break;
            }
        }
    }
}