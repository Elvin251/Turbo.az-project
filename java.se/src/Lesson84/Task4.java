package Lesson84;

public class Task4 {
    public static void main(String[] args) {

        String text = "Java Programming Language";

        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))){
                count++;
            }
        }

        System.out.println("Boyuk herf sayi: " + count);
    }
}