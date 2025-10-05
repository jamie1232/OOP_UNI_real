package week03tutorial;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31.");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1980 || year > 2079) {
            throw new IllegalArgumentException("Year must be between 1980 and 2079.");
        }
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        String dd = (day < 10) ? "0" + day : String.valueOf(day);
        String mm = (month < 10) ? "0" + month : String.valueOf(month);
        return dd + "/" + mm + "/" + year;
    }

    @Override
    public String toString() {
        return "Date [ day = " + day + ", month = " + month + ", year = " + year + " ]";
    }
}
