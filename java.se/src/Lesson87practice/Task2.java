package Lesson87practice;

public class Task2 {
    public static void main(String[] args) {
        String text = "Java proqramlasdirma dili cox maraqlidir";
        String[] words = text.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("En uzun soz: " + longest);
    }
}