package lesson10;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3);
        //������ ��������� ����� ������� (�������� 3 �������� (4, 5, 7) �� ������� arr � ������ arr, ������� � 3-�� �������
        // �� 2-�� ������� � ������� ���������� � ����������� �������� ).
        Arrays.copyOf(arr, 2);//�������� ��������, ������ ������ �������, ��� ���������� ������
                                       // ���������� ������� ����� ������ � � ���� ���������� ��������, ����� ����� �������� �� �����
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}


