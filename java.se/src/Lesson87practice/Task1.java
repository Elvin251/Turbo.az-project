package Lesson87practice;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 11, 8, 13};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }

        System.out.println("Sade ededlerin cemi: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}