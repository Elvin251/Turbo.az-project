package Lesson89Homework;

public class TryCatchTasks {
    public static void main(String[] args) {

        // 1) 0-a bölmə xətasının qarşısını alma
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Nəticə: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Xəta: 0-a bölmək olmaz!");
        }

        // 2) String-i ədədə çevirərkən xəta
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Ədəd: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Xəta: String ədədə çevrilə bilmədi!");
        }

        // 3) Massivdə index xətası
        try {
            int[] arr = new int[10];
            arr[10] = 5; // səhv index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xəta: Massiv indexi yanlışdır!");
        }

        // 4) String-dən simvol götürərkən xəta
        try {
            String text = "Java";
            char ch = text.charAt(10); // səhv index
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Xəta: String indexi yanlışdır!");
        }

        // 5) Wrapper class ilə null xətası
        try {
            Integer number = null;
            int result = number + 5; // null -> NullPointerException
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Xəta: Null dəyər ilə əməliyyat olmaz!");
        }

    }
}