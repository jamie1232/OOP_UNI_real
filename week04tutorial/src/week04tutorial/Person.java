package week04tutorial;

/**
 * Person superclass
 */
public class Person {

    protected String myName;
    protected int myAge;
    protected String myGender; // "M" or "F"

    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // getters and setters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
