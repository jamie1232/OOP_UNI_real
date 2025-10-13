package week04tutorial;

public class TestSchoolApplication {

    public static void main(String[] args) {
        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);

        Student beth = new Student("Elisabeth Smith", 16, "F", "122233");
        beth.setFee(12000);
        beth.setGrade("10A");
        System.out.println(beth);

        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println(sam);

        // Demonstrate polymorphism
        Person p = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println("Person p referencing Teacher object: " + p);

        // The following would NOT compile (uncomment to see a compile error)
        // Teacher t = new Person("Sam Hamilton", 34, "M");
        // So we will not do that; instead show correct casting example:
        Person s = new Student("Elisabeth Smith", 16, "F", "122233");
        System.out.println("Person s referencing Student object: " + s);

        // Assign tutees to a teacher
        Teacher tchr = new Teacher("Laura White", 42, "F", "Mathematics", 48000);
        Student s1 = new Student("Amy", 15, "F", "2001");
        Student s2 = new Student("Ben", 15, "M", "2002");
        Student s3 = new Student("Cara", 15, "F", "2003");
        tchr.addTutee(s1);
        tchr.addTutee(s2);
        tchr.addTutee(s3);

        System.out.println(tchr);
    }
}
