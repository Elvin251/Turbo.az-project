package Lesson84;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }

        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}