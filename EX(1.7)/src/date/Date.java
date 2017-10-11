package date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        String m ;
        String d ;

        if (month < 10)
            m = "0".concat(String.valueOf(month));
        else
            m = String.valueOf(month);
        if (month < 10)
            d = "0".concat(String.valueOf(day));
        else
            d = String.valueOf(day);
        return d.concat("/".concat(m).concat("/").concat(String.valueOf(year)));
    }
}
