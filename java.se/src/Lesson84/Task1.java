package Lesson84;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};

        int max1 = arr[0];
        int max2 = arr[1];

        if(max2 > max1){
            int temp = max1;
            max1 = max2;
            max2 = temp;
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
        }

        System.out.println("Cem: " + (max1 + max2));
    }
}