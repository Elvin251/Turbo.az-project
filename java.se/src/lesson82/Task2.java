package lesson82;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 1};
        int[] b = {1, 1, 3, 2};

        int[] temp = new int[a.length];
        int size = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {

                    boolean exists = false;
                    for (int k = 0; k < size; k++) {
                        if (temp[k] == a[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        temp[size++] = a[i];
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}