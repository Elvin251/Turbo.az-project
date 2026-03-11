package Lesson84;

public class Task3 {
    public static void main(String[] args) {

        String text = "Java programming is very interesting";

        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println("Space sayi: " + count);
    }
}