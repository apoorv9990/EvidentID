package com.evidentid;

import android.support.annotation.CallSuper;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by patel on 7/14/2017.
 */

public abstract class BasePresenter<T> {
    protected T view;

    private CompositeDisposable subs;

    protected T getView() {
        return view;
    }

    public void attachView(T view) {
        this.view = view;
    }

    public void detachView() {
        this.view = null;
    }
}

