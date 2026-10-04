package Week3.datetime;

public class CustomDate {

    // Variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // GET month
    public int getMonth() {
        return month;
    }

    // SET month
    public void setMonth(int month) {
        this.month = month;
    }

    // GET day
    public int getDay() {
        return day;
    }

    // SET day
    public void setDay(int day) {
        this.day = day;
    }

    // GET year
    public int getYear() {
        return year;
    }

    // SET year
    public void setYear(int year) {
        this.year = year;
    }
//-------------------------------------------------------------------------

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }


}