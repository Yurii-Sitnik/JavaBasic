package lesson07;

public class Sequence {

    public static void main(String[] args) {
        String str = "RROOOWW";
        System.out.println(someMethod(str));
    }
    static int someMethod(String str) {
        char[] Arr = str.toCharArray();
        int count = 1;
        for (int i = 0; i < Arr.length - 1; i++) {
            if (Arr[i] != Arr[i + 1])
                count++;
        }
        return count;
    }
}

