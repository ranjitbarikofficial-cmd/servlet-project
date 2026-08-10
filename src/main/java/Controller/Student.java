package Controller;


public class Student {

    private String name;
    private String mail;
    private String address;
    private int age;

    public Student(String name, String mail, String address, int age) {
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}