package Lesson85;

public class Task2 {
    public static void main(String[] args) {

        // 1
        char[] arr = {'A','B','C','D','E','F','G'};
        String text = new String(arr);
        System.out.println("1) " + text);
        System.out.println("----------------");

        // 2
        String word = "Hello";

        if(word.length() == 5){
            System.out.println("2) 5 simvoldur");
        } else {
            System.out.println("2) 5 simvol deyil");
        }
        System.out.println("----------------");

        // 3
        String empty = "";

        if(empty.isEmpty()){
            System.out.println("3) String boşdur");
        } else {
            System.out.println("3) String boş deyil");
        }
        System.out.println("----------------");

        // 4
        String result = changeText("Java çox yaxşı dildir", "yaxşı", "gözəl");
        System.out.println("4) " + result);
        System.out.println("----------------");
    }

    public static String changeText(String a, String b, String c){
        return a.replace(b, c);
    }
}