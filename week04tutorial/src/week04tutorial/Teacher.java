package week04tutorial;

/**
 * Teacher subclass of Person
 */
public class Teacher extends Person {

    private double salary;
    private String subject;

    // Each teacher has 3 personal tutees (as per exercise). We'll model as an array.
    private Student[] tutees = new Student[3];

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Tutee management: set a tutee at index 0..2, or add to first empty slot
    public boolean addTutee(Student s) {
        for (int i = 0; i < tutees.length; i++) {
            if (tutees[i] == null) {
                tutees[i] = s;
                return true;
            }
        }
        return false; // no space
    }

    public void setTutee(int index, Student s) {
        if (index >= 0 && index < tutees.length) {
            tutees[index] = s;
        }
    }

    public Student[] getTutees() {
        return tutees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(", subject=").append(subject).append(", salary=").append(salary);
        sb.append("\nTutees: ");
        for (int i = 0; i < tutees.length; i++) {
            if (tutees[i] != null) {
                sb.append("[").append(i).append(":" + tutees[i].getName()).append("] ");
            } else {
                sb.append("[").append(i).append(":empty] ");
            }
        }
        return sb.toString();
    }
}
