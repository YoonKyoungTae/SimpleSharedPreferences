package kr.co.diordna.sample.simplesharedpreferences;

import android.app.Application;

import kr.co.diordna.simplesharedpreferences.SSP;

/**
 * Created by ryans on 2018-04-11.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SSP.init(this);
    }
}
