public class Student {
    int id;
    String name;
    String date;
    String email;
    String adress;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Student(int id, String name, String date) {
        this(id, name);
        this.date = date;
    }

    public Student(int id, String name, String date, String email) {
        this(id, name, date);
        this.email = email;
    }

    public Student(int id, String name, String date, String email, String adress) {
        this(id, name, date, email);
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student(20, "Bob", "12.05.1999", "odessa@gmail.com", "Deribasovskaya");
        System.out.println(student1);

    }
}
