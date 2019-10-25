package finalStatic;

import java.security.DrbgParameters;
import java.time.Instant;

import static finalStatic.Validation.checkHour;
import static finalStatic.Validation.checkMinute;
import static finalStatic.Validation.checkSecond;

public class Time {
    // hours (0 ~ 23)
    //mins (0~59)
    //seconds (0~59)
    public static int instanceCount;

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0,0,0);
    }

    public Time(int hour) {
        this(hour,0,0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        checkHour(hour);
        checkMinute(minute);
        checkSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        instanceCount++;
    }

    public String toUniversalForm() {
        // HH:MM:SS - 21:30:34 "%02d": decimal 2 digits padding 0 to the left
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }

    public String toStandardForm() {
        // H:MM: SS (AM or PM)
        int h = (hour == 0 || hour == 12) ? 12 : hour % 2;
        String unit = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s",h, minute, second, unit);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        checkHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        checkMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        checkSecond(second);
        this.second = second;
    }
}
