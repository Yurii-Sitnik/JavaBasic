package lesson10;

import java.util.Arrays;

public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 5, 9, 9, 8, 7, 7, 6};

        System.out.print("\nСортировка: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                  arr = ArrayUtils.remove(arr, j); //импортировал метод remove, который удаляет повторяющиеся элементы
                   }
            }
        }
        System.out.println("\nПосле удаления дубликатов \n" + Arrays.toString(arr));
    }
}






