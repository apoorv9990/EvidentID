package com.evidentid.di.components;

import com.evidentid.activities.MainActivity;
import com.evidentid.di.modules.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by patel on 7/13/2017.
 */

@Singleton
@Component(modules = {ApiModule.class})
public interface CoreComponent {
    void inject(MainActivity activity);
}
