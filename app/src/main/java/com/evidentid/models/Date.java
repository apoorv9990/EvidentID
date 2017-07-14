package com.evidentid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by patel on 7/13/2017.
 */

public class Date {
    private String pretty;
    private String year;
    @SerializedName("mon")
    private String month;
    @SerializedName("mday")
    private String dayOfMonth;
    private String hour;
    @SerializedName("min")
    private String minute;
    @SerializedName("tzname")
    private String timeZoneName;

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }
}
