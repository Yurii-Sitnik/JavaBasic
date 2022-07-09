package lesson07;
import java.util.ArrayList;
import java.util.List;

public class Combination {

    private static List list = new ArrayList<String>();

    public static void main(String[] args) {
        String str = "RROOOWW";
        int n = str.length();
        Combination test = new Combination();
        test.per(str, 0, n-1);
        System.out.println(list.size());
    }

    private String pro(String str,int i,int j) {
        char temp;
        char[] chars = str.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    private void per(String str,int a,int b) {
        if(a == b) {
            System.out.println(str);
            list.add(str);
        }else {
            for(int i = a;i <= b;i++){
                str = pro(str,a,i);
                per(str,a+1,b);
            }
        }
    }
}
