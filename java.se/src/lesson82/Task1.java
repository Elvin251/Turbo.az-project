package lesson82;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 1, 3, 4, 3};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 3) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}