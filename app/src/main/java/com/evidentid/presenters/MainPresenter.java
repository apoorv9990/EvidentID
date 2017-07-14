package com.evidentid.presenters;

import com.evidentid.BasePresenter;
import com.evidentid.network.CoreApi;
import com.evidentid.network.responses.GetHistoryResponse;
import com.evidentid.presenters.views.MainView;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by patel on 7/14/2017.
 */

public class MainPresenter extends BasePresenter<MainView> {

    private CoreApi mCoreApi;

    @Inject
    public MainPresenter(CoreApi coreApi) {
        mCoreApi = coreApi;
    }

    public void getHistory() {
        mCoreApi.getHistory("2017","01","13","GA","Alpharetta")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getHistoryResponse -> {
                    if(getView()!= null) {
                        getView().showHistory(getHistoryResponse.getHistory());
                    }
                }, throwable -> {
                    throwable.printStackTrace();
                    if(getView()!= null) {
                        getView().showError();
                    }
                });
    }
}
