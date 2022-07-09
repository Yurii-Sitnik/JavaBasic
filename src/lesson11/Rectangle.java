package lesson11;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Введите длины 2-х сторон прямоугольника");
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();

        Perimetr(side1, side2);
        Area(side1, side2);
    }

    private static double Perimetr(double side1, double side2) {
        double varPerimetr = (side1 + side2) * 2;
        System.out.println("Периметр" + " = " + varPerimetr);
        return varPerimetr;
    }

    private static double Area(double side1, double side2) {
        double varArea = side1 * side2;
        System.out.println("Площадь" + " = " + varArea);
        return varArea;
    }
}




