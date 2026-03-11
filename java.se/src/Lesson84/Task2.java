package Lesson84;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 10, 3};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg){
                count++;
            }
        }

        System.out.println("Ortalamadan boyuk element sayi: " + count);
    }
}