package lesson07;

public class Student {
    private String name;
    private String email;
    private Phone phone;
    private Car car;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (name);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return (email);
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return (phone);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public static void main(String... args) {
        Student vlad = new Student();
        vlad.setName("Vlad");
        vlad.setEmail("fhjvjj");
        System.out.println(vlad);

        Student yulja = new Student();
        yulja.setName("Julja");
        yulja.setEmail("ftfdtyfugbk");
        System.err.println(yulja);

    }

    class Phone {
        private String number;
    }

    class Car {
        private String name;
    }


}
