package lesson10;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3);
        //делает частичную копию массива (копирует 3 элемента (4, 5, 7) из массива arr в массив arr, начиная с 3-го индекса
        // до 2-го индекса в массиве назначения с перекрытием областей ).
        Arrays.copyOf(arr, 2);//копирует значения, меняет длинну массива, для корректной работы
                                       // необходимо создать новый массив и в него копировать значения, после этого выводить на экран
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}


