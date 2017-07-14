package com.evidentid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by patel on 7/13/2017.
 */

public class Observation {
    private Date date;
    @SerializedName("utcdate")
    private Date utcDate;
    private String tempm;
    private String tempi;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(Date utcDate) {
        this.utcDate = utcDate;
    }

    public String getTempm() {
        return tempm;
    }

    public void setTempm(String tempm) {
        this.tempm = tempm;
    }

    public String getTempi() {
        return tempi;
    }

    public void setTempi(String tempi) {
        this.tempi = tempi;
    }
}
