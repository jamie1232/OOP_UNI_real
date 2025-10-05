package week03tutorial;

public class Director {

    private final String name;
    private final String surname;
    private int numberOfMovie;
    private Date dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.numberOfMovie = 0;
        this.dob = null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDoB() {
        return dob;
    }

    public int getNumberOfMovie() {
        return numberOfMovie;
    }

    public void setDoB(Date dob) {
        this.dob = dob;
    }

    public void setNumberOfMovie(int nMovie) {
        if (nMovie < 0) {
            throw new IllegalArgumentException("Number of movies cannot be negative.");
        }
        this.numberOfMovie = nMovie;
    }

    @Override
    public String toString() {
        String dobStr = (dob == null) ? "N/A" : dob.getDate();
        return "Director [ name = " + name + ", surname = " + surname + ", dob = " + dobStr
                + ", movies directed = " + numberOfMovie + " ]";
    }
}
