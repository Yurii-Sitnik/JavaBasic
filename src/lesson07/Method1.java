package lesson07;

public class Method1 {
    public static void main(String[] args) {
        String a = function("fool55");
        System.out.println(a);

    }
    static String function(String name){
        if (name.equals("fool")){
            return "�� ����� ������������ �����";
        }
        String a = "Hello " + name + "!!!";
            return a;

    }
}


