package lesson05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� �������");
        String age = scanner.nextLine();
        scanner.close();
        switch (age) {
            case "����":
                System.out.println("�� �������");
                break;
            case "����":
                System.out.println("�� ����� � �����");
                break;
            case "�����������":
                System.out.println("�� �������� �����");
                break;
            default:
                System.out.println("�� ���� �� ��������� �������");
        }
    }
}
