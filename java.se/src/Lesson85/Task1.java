package Lesson85;

public class Task1 {
    public static void main(String[] args) {

        // 1
        String name = "Cavid";
        System.out.println("1) name: " + name);
        System.out.println("---------------------");

        // 2
        String message = "Java dili güclü və effektli bir proqramlaşdırma dilidir";
        System.out.println("2) message: " + message);
        System.out.println("---------------------");

        // 3
        System.out.println("3) Simvol sayı: " + message.length());
        System.out.println("---------------------");

        // 4
        System.out.println("4) 2-ci simvol: " + message.charAt(1));
        System.out.println("---------------------");

        // 5
        System.out.println("5) 'i' simvolunun indeksi: " + message.indexOf('i'));
        System.out.println("---------------------");

        // 6
        System.out.println("6) Kiçik hərflərlə: " + message.toLowerCase());
        System.out.println("---------------------");

        // 7
        System.out.println("7) Böyük hərflərlə: " + message.toUpperCase());
        System.out.println("---------------------");

        // 8
        System.out.println("8) 'g' simvolu var?: " + message.contains("g"));
        System.out.println("---------------------");

        // 9
        System.out.println("9) 'dilidir' ilə bitir?: " + message.endsWith("dilidir"));
        System.out.println("---------------------");

        // 10
        System.out.println("10) 'Java' ilə başlayır?: " + message.startsWith("Java"));
        System.out.println("---------------------");

        // 11
        name = "   Adil    ";
        System.out.println("11) name: '" + name + "'");
        System.out.println("---------------------");

        // 12
        System.out.println("12) trim edilmiş: '" + name.trim() + "'");
        System.out.println("---------------------");

        // 13
        name = "Bəxtiyar";
        System.out.println("13) name: " + name);
        System.out.println("---------------------");

        // 14
        System.out.println("14) İlk 4 simvol: " + name.substring(0, 4));
        System.out.println("---------------------");

        // 15
        name = "Əli Həsənov";
        System.out.println("15) name: " + name);
        System.out.println("---------------------");

        // 16
        String[] words = name.split(" ");

        System.out.println("16) Massivin elementləri:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("---------------------");
    }
}