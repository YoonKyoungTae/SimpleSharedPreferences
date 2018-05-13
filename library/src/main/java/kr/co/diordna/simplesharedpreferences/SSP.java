package kr.co.diordna.simplesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.Set;

/**
 * Created by ryans on 2018-04-03.
 */

public class SSP {

    private static SharedPreferences mPref;

    private SSP(){}

    public static void init(Context context) {
        mPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }

    public static Editor openEdit() {
        if (mPref == null) {
            throw new NullPointerException("SSP require call init()");
        }
        return new Editor(mPref);
    }

    public static String getString(String key, String def) {
        return mPref.getString(key, def);
    }

    public static int getInt(String key, int def) {
        return mPref.getInt(key, def);
    }

    public static boolean getBoolean(String key, boolean def) {
        return mPref.getBoolean(key, def);
    }

    public static float getFloat(String key, float def) {
        return mPref.getFloat(key, def);
    }

    public static long getLong(String key, long def) {
        return mPref.getLong(key, def);
    }

    public static Set<String> getStringSet(String key, Set<String> def) {
        return mPref.getStringSet(key, def);
    }

    public static class Editor {

        private SharedPreferences.Editor mEditor;

        public Editor(SharedPreferences pref) {
            mEditor = pref.edit();
        }

        public Editor putString(String key, String val) {
            put(key, val);
            return this;
        }

        public Editor putInt(String key, int val) {
            put(key, val);
            return this;
        }

        public Editor putBoolean(String key, boolean val) {
            put(key, val);
            return this;
        }

        public Editor putFloat(String key, float val) {
            put(key, val);
            return this;
        }

        public Editor putLong(String key, long val) {
            put(key, val);
            return this;
        }

        public Editor putStringSet(String key, Set<String> val) {
            put(key, val);
            return this;
        }

        public Editor put(String key, String val) {
            mEditor.putString(key, val);
            return this;
        }

        public Editor put(String key, int val) {
            mEditor.putInt(key, val);
            return this;
        }

        public Editor put(String key, boolean val) {
            mEditor.putBoolean(key, val);
            return this;
        }

        public Editor put(String key, float val) {
            mEditor.putFloat(key, val);
            return this;
        }

        public Editor put(String key, long val) {
            mEditor.putLong(key, val);
            return this;
        }

        public Editor put(String key, Set<String> val) {
            mEditor.putStringSet(key, val);
            return this;
        }

        public void clear() {
            mEditor.clear();
        }

        public void remove(String key) {
            mEditor.remove(key);
        }

        public boolean commit() {
            return mEditor.commit();
        }

        public void apply() {
            mEditor.apply();
        }
    }

}
