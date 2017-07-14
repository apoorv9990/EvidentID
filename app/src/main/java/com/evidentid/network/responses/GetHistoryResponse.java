package com.evidentid.network.responses;

import com.evidentid.models.History;

/**
 * Created by patel on 7/13/2017.
 */

public class GetHistoryResponse {
    private History history;

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
