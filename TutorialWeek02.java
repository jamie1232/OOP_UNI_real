/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author w2077449
 */

// TutorialWeek02.java
public class TutorialWeek02 {
    public static void main(String[] args) {
        Person p1 = new Person("Ben");
        p1.setSurname("Smith");
        p1.setAge(25);
        p1.displayName();
        System.out.println(p1.getSurname() + ", " + p1.getAge());

        // More persons
        Person p2 = new Person("Alice");
        p2.setSurname("Johnson");
        p2.setAge(30);

        Person p3 = new Person("John");
        p3.setSurname("Doe");
        p3.setAge(40);

        Person p4 = new Person("Mary");
        p4.setSurname("Brown");
        p4.setAge(22);

        Person[] people = {p1, p2, p3, p4};
        for (Person person : people) {
            person.displayName();
            System.out.println("Surname: " + person.getSurname() + ", Age: " + person.getAge());
        }
    }
}

