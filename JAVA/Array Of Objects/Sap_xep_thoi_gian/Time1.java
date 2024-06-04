package Sap_xep_thoi_gian;
import java.util.*;
public class Time1 {
    public int hour, minute, second;

    public Time1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time1[] sortTimes(Time1[] times) {
        Arrays.sort(times, (a, b) -> {
            if (a.hour < b.hour) {
                return -1;
            } else if (a.hour > b.hour) {
                return 1;
            } else {
                return 0;
            }
        });
        return times;
    }
}
