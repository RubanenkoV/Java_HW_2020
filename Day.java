package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Day extends Hour {
    public int day;

    public Day(int hour, int minute) {
        super(hour, minute);
        this.day = day;

    }

    public void SetDay(int day, int hour, int minute) {
        if (day < 1 || day > 31) {
            throw new Error("Check your input");
        } else this.day = day;
        if (hour < 1 || hour > 25) {
            throw new Error("Check your input");
        } else this.hour = hour;
        if (minute < 0 || minute > 60) {
            throw new Error("Check your input");
        } else this.minute = minute;
    }

    public void PrintTime() {
        System.out.println(hour + ":" + minute);
    }
}
