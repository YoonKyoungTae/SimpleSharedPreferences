package kr.co.diordna.simplesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by ryans on 2018-04-03.
 */

public class SSP {

    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;

    private volatile static SSP instance = null;

    private SSP(){}

    public SSP getInstance() {
        if (instance == null) {
            synchronized (SSP.class) {
                if (instance == null) {
                    instance = new SSP();
                }
            }
        }

        return instance;
    }

    public void init(Context context) {
        mPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        mEditor = mPref.edit();
    }

}
