/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author w2077449
 */

// Person.java
    public class Person {

        private String name;
        private String surname;
        private int age;

        // Constructor
        public Person(String n) {
            this.name = n;
        }

        // Setters
        public void setSurname(String s) {
            this.surname = s;
        }

        public void setAge(int num) {
            this.age = num;
        }

        // Getters
        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }

        // Display method
        public void displayName() {
            System.out.println("Name: " + name);
        }
    }
