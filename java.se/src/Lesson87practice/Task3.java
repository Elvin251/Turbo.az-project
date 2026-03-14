package Lesson87practice;

public class Task3 {
    public static void main(String[] args) {
        String text = "Salam men Java oyrenirem";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'ə' || c == 'ı' || c == 'ö' || c == 'ü') {
                count++;
            }
        }

        System.out.println("Saitlerin sayi: " + count);
    }
}