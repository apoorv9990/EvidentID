package com.evidentid.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.evidentid.EvidentApplication;
import com.evidentid.R;
import com.evidentid.models.History;
import com.evidentid.presenters.MainPresenter;
import com.evidentid.presenters.views.MainView;

import javax.inject.Inject;

/**
 * Created by patel on 7/13/2017.
 */

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EvidentApplication) getApplication()).getCoreComponent().inject(this);

        presenter.attachView(this);

        presenter.getHistory();
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    @Override
    public void showHistory(History history) {

    }

    @Override
    public void showError() {
    }
}
