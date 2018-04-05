package kr.co.diordna.simplesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.ArrayList;

/**
 * Created by ryans on 2018-04-03.
 */

public class SSP {

    private SharedPreferences mPref;
    private SharedPreferences.Editor mEditor;

    private ArrayList<SharedPreferences.Editor> mEditors;

    private SSP(){}

    private static class LazyHolder{
        private static final SSP instance = new SSP();
    }

    public static SSP getInstance() {
        return LazyHolder.instance;
    }

    public void init(Context context) {
        mPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        mEditors = new ArrayList<>();
    }

    public SSP put() {
        // 에디터 생성
        return this;
    }

    public SSP add() {
        // put한 에디터에만 add시킨다
        return this;
    }



//    public SSP put(String key, String value) throws JSONException {
//        mEditors.add(mEditor.putString(key, value));
//        return this;
//    }

    public void commit() {
        SharedPreferences.Editor commiter = mPref.edit();

        mEditor.commit();
//        mEditor = null;
//        mEditor = mPref.edit();
    }

    public void apply() {
        mEditor.apply();
//        mEditor = null;
//        mEditor = mPref.edit();
    }

    private void makeEditor() {
        if (mEditor == null) {
            mEditor = mPref.edit();
        }
    }
}
