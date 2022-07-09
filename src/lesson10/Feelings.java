package lesson10;
import java.util.Scanner;

public class Feelings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите строку");
        String input = scanner.nextLine();
        System.out.println(input + " == " + calculate(input) + " feelings");
    }

    private static int calculate(String input) {
        String[] feelings = {"anger", "awe", "joy", "love", "grief"};
        int[] inputConcur = concurrency(input);
        int count = 0;
        for (String feeling : feelings) {
            int[] feelingConcur = concurrency(feeling);
            boolean yes = true;
            for (int i = 0; yes && i < inputConcur.length; i++) {
                if (feelingConcur[i] > inputConcur[i])
                    yes = false;
            }
            if (yes)
                count++;
        }
        return count;
    }

    private static int[] concurrency(String inputString) {
        int[] concur = new int[26];
        char[] letters = inputString.toCharArray();
        for (char i : letters) {
            if (Character.isLetter(i))
                concur[i - 'a']++;
        }
        return concur;
    }
}

