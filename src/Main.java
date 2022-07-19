import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(15);
        list.add(18);
        list.add(22);
        list.add(35);
        list.add(64);

        ListIterator<Integer>listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            int x = integer+1;
            System.out.println(x);
        }

    }


}
