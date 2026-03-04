package Lesson83;
public class Task7 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 5, 2, 7};

        int target = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Tekrarlanma sayi: " + count);
    }
}
