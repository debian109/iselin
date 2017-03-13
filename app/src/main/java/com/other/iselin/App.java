package com.other.iselin;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import com.other.iselin.di.component.AppComponent;
import com.other.iselin.di.component.DaggerAppComponent;
import com.other.iselin.di.module.AppModule;

/**
 * Created by thinh on 3/10/17.
 */

public class App extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this))
                .build();

    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

}
