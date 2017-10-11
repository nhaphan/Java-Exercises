package date;

public class MyDate {
    private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May",
            "Jun", "Jul", "Aug", "Step", "Oct", "Nov", "Dec"};
    private static String[] strDays = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31)
            return false;
        if (MyDate.isLeapYear(year)) {
            if (month == 2 && (day < 1 && day > 29))
                return false;
        } else {
            if ((month == 2) && (day < 1 || day > 28)) return false;
            else if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) && (day < 1 || day > 31))
                return false;
            else if ((month == 4 || month == 6 || month == 9 ||
                    month == 11) && (day < 1 || day > 30))
                return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryZeller = year / 100;
        int yearZeller = year % 100;
        int monthZeller = 11;
        if (month - 2 > 0)
            monthZeller = month - 2;
        else {
            monthZeller = 10 + month;
        }
        return ((13 * monthZeller - 1) / 5 +
                (yearZeller / 4) + (centuryZeller / 4) + day + yearZeller - (2 * centuryZeller)) % 7;
    }

    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        String day_ = "";/*strDays[getDayOfWeek(year, month, day)]*/;
        String month_ = strMonths[month - 1];
        return day_.concat(" ").concat(String.valueOf(day)).
                concat(" ".concat(month_).concat(" ")).concat(String.valueOf(year));
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day)) {
            if (MyDate.isLeapYear(year)) {
                if (day < 29 && month == 2) {
                    day = 29;
                }  if (month == 2 && day == 29) {
                    day = 1;
                    month = 3;
                }
            } else {
                if (month == 2 && day < 28) {
                    day++;
                } else if (month == 2 && day == 28) {
                    month = 3;
                    day = 1;
                }
            }

            boolean months = (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10);
            if (months && day < 31) {
                day++;
            } else if (months && (day == 31)) {
                day = 1;
                month++;
            } else if ((month == 12) && (day == 31)) {
                year++;
                month = 1;
                day = 1;
            }
            if ((month == 4 || month == 6 || month == 9 ||
                    month == 11) && (day < 30)) {
                day++;
            } else if (month == 4 || month == 6 || month == 9 ||
                    month == 11 && (day == 30)) {
                month++;
                day = 1;
            }
        }
        return this;
    }
}
