package Lesson87practice;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Telefon", 123),
                new Product("Laptop", 246),
                new Product("Mouse", 55),
                new Product("Keyboard", 71)
        };

        for (int i = 0; i < products.length; i++) {
            int sum = digitSum(products[i].price);

            if (sum % 2 == 0) {
                System.out.println(products[i].name + " - price: " + products[i].price);
            }
        }
    }

    public static int digitSum(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}