package traning;

public class Recursion {
    static void recursion(int counter){
        counter--;
        System.out.println("ѕерва€ половина метода:"+counter);
        if (counter!=0)
            recursion(counter);
        System.out.println("втора€ половина метода:"+counter);
        }

    public static void main(String[] args) {
        recursion(3);
    }

}
