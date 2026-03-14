package Lesson87practice;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {12, 55, 103, 40, 99, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = digitSum(arr[i]);

            if (sum > 10) {
                count++;
            }
        }

        System.out.println("Reqemleri cemi 10-dan boyuk olan ededlerin sayi: " + count);
    }

    public static int digitSum(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}