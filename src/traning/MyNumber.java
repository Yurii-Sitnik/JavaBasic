package traning;

import java.util.Scanner;

class MyNumber {

    public static void main(String[] args) {
        System.out.println("¬ведите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = ++n;//6
        int y = --m;//2
        if (x != 0 && y != 0) {
            int z = (x-- / y++) + (++y / --x);//6/2+4/4

            System.out.println(z);
        }
    }
}

