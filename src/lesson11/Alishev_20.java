package lesson11;

public class Alishev_20 {
    public static void main(String[] args) {
        Humann human1 = new Humann();
    }
}
class Humann {
    private String name;
    private int age;
    public Humann() {
        this.name = "��� �� ���������";
        this.age = 0;
        System.out.println("������ �� ������� ������������!");
    }
   public Humann(String name) {
       this.name = name;
       System.out.println("������ �� ������� ������������!");
   }
   public Humann(String name, int age) {
       this.name = name;
       this.age = age;
       System.out.println("������ �� �������� ������������!");
   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
