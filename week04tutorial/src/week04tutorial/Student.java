package week04tutorial;

/**
 * Student subclass of Person
 */
public class Student extends Person {

    private String idNum;
    private double fee;
    private String grade;

    public Student(String name, int age, String gender, String idNum) {
        super(name, age, gender);
        this.idNum = idNum;
        this.fee = 0.0;
        this.grade = "N/A";
    }

    // getters and setters
    public String getIDNum() {
        return idNum;
    }

    public void setIDNum(String idNum) {
        this.idNum = idNum;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID=" + idNum + ", fee=" + fee + ", grade=" + grade;
    }
}
