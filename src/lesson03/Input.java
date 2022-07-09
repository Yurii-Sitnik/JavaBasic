package lesson03;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter a variable of type int");
        int a = x.nextInt();
        System.out.println("enter a variable of type double");
        double b = x.nextDouble();
        System.out.println("enter a variable of type string");
        String c = x.next();
        System.out.printf("this number %2$s", a, b, c);
        }
    }

