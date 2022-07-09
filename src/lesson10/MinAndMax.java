package lesson10;

public class MinAndMax {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nКоличество минимальных чисел " + minim(array));
        System.out.println("Количество максимальных чисел " + maxim(array));
    }

    private static int minim(int[] array) {
        int count = 0;
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
                count = 0;
            }
            if (i == min)
                count++;
        }
        return count;
    }

    private static int maxim(int[] array) {
        int count = 0;
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
                count = 0;
            }
            if (i == max)
                count++;
        }
        return count;
    }
}





