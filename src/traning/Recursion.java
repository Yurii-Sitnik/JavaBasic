package traning;

public class Recursion {
    static void recursion(int counter){
        counter--;
        System.out.println("������ �������� ������:"+counter);
        if (counter!=0)
            recursion(counter);
        System.out.println("������ �������� ������:"+counter);
        }

    public static void main(String[] args) {
        recursion(3);
    }

}
