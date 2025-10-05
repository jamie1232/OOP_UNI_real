package week03tutorial;

public class Actor {

    private String name;
    private String surname;
    private int age;

    public Actor() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    public Actor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor [ name = " + name + ", surname = " + surname + ", age = " + age + " ]";
    }
}
