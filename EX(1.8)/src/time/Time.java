package time;

public class Time {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(){}
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String h ;
        String m ;
        String s ;
        if (hour < 10)
            h = "0".concat(String.valueOf(hour));
        else
            h = String.valueOf(hour);
        if (minute < 10)
            m = "0".concat(String.valueOf(minute));
        else
            m = String.valueOf(minute);
        if (second < 10)
            s = "0".concat(String.valueOf(second));
        else
            s = String.valueOf(second);
        return h.concat(":".concat(m).concat(":").concat(s));
    }

    public Time nextSecond() {

        if (this.second == 59 && this.minute < 59 && this.hour < 23){
            this.minute ++;
            this.second = 0;
        }
        else if (this.second == 59 && this.minute == 59 && this.hour < 23) {
            this.hour ++;
            this.minute = 0;
            this.second = 0;
        }
        else if (this.second == 59 && this.minute == 59 && this.hour == 23) {
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        } else
            this.second ++;
        return this;
    }
    public Time nextMinute() {
        if (this.minute < 59 && this.hour < 23)
            minute ++;
        else  if (this.minute == 59 && this.hour < 23) {
            this.hour ++;
            this.minute = 0;
        }
        else if (this.minute == 59 && this.hour == 23) {
            this.hour = 0;
            this.minute = 0;
        }
        return this;
    }
    public Time nextHour() {
        if (this.hour == 23)
            this.hour = 0;
        else
            this.hour ++;
        return this;
    }
    public Time previousSecond() {
        if (this.second == 0 && this.minute > 0 && this.hour > 0) {
            this.minute --;
            this.second = 59;
        }
        else if (this.second == 0 && this.minute == 0 && this.hour > 0) {
            this.hour --;
            this.minute = 59;
            this.second = 59;
        }
        else if (this.second == 0 && this.minute == 0 && this.hour == 0) {
            this.hour = 23;
            this.minute = 59;
            this.second = 59;
        }
        else
            this.second --;
        return this;
    }
}
