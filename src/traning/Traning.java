package traning;

public class Traning {
    static int difference (int weight, int height){
        return height-weight;
    }

    public static void main(String[] args) {
       int difference;
        difference = difference(5,8);
        difference = difference(5,10);


        System.out.println(difference);
    }
}
