package lesson02;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        System.out.println("�������� ���� � 5 �������");
        System.out.println("��� ������ �� ���� ������� - exit");
        final int MAXX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";
        Scanner scanner = new Scanner(System.in);
        while (attempt<MAXX_ATTEMPT) {
            attempt++;
            System.out.println("������� " + attempt);
            String value = scanner.next();
            if (value.equals("exit")) {
                break;
            }
            if (!value.equals(color)) {
                continue;
            }
            System.out.println("�����������, �� ������� ���� � " + attempt + " �������");
            break;
        }

            System.out.println("����� ����");
        scanner.close();
        }

    }

