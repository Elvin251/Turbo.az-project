package Lesson85;

public class Task2 {

    public static void main(String[] args) {

        // 1
        char[] letters = {'J', 'a', 'v', 'a', 'S', 'E', '!'};
        String text = new String(letters);

        System.out.println("1) Massivdən String: " + text);
        System.out.println("---------------------");


        // 2
        String word = "Hello";

        boolean isFiveLetters = word.matches("[a-zA-Z]{5}");

        System.out.println("2) 5 ingilis hərfindən ibarətdir?: " + isFiveLetters);
        System.out.println("---------------------");


        // 3
        String emptyText = "";

        System.out.println("3) String boşdur?: " + emptyText.isEmpty());
        System.out.println("---------------------");


        // 4
        String result = replaceText(
                "Java dili çox güclü dildir",
                "güclü",
                "məşhurdur"
        );

        System.out.println("4) Nəticə: " + result);
        System.out.println("---------------------");
    }


    // 4-cü tapşırıq üçün metod
    public static String replaceText(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }

}