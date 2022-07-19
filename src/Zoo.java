import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Dog");
        list.add(1, "Cat");
        list.add(2, "pig");
        list.add(3, "cow");
        list.add(4, "horse");
        list.add(5, "sheep");
        list.add(6, "chicken");
        list.add(7, "giraffe");

        System.out.println(list);
        System.out.println("Длина массива " + list.size());
        list.remove(6);
        list.remove(4);
        list.remove(2);
        System.out.println(list);

        System.out.println("Длина массива " + list.size());

    }
}