package com.evidentid.presenters.views;

import com.evidentid.models.History;

/**
 * Created by patel on 7/14/2017.
 */

public interface MainView {
    void showHistory(History history);
    void showError();
}
