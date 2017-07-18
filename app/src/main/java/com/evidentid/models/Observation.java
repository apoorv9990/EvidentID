package com.evidentid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by patel on 7/13/2017.
 */

public class Observation {
    private Date date;
    @SerializedName("utcdate")
    private Date utcDate;

    @SerializedName("tempm")
    private String minTemp;
    @SerializedName("tempi")
    private String maxTemp;

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

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }
}
