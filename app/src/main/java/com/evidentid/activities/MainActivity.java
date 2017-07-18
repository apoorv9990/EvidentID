package com.evidentid.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.evidentid.EvidentApplication;
import com.evidentid.R;
import com.evidentid.adapters.ObservationAdapter;
import com.evidentid.models.History;
import com.evidentid.presenters.MainPresenter;
import com.evidentid.presenters.views.MainView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by patel on 7/13/2017.
 */

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.observation_recycler_view)
    RecyclerView observationRecyclerView;

    @Inject
    MainPresenter presenter;

    private ObservationAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ((EvidentApplication) getApplication()).getCoreComponent().inject(this);

        mAdapter = new ObservationAdapter();

        observationRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        observationRecyclerView.setAdapter(mAdapter);

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
        mAdapter.setItems(history.getObservations());
    }

    @Override
    public void showError() {
    }
}
