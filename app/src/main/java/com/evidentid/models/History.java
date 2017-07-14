package com.evidentid.models;

import java.util.List;

/**
 * Created by patel on 7/13/2017.
 */

public class History {
    private List<Observation> observations;

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }
}
