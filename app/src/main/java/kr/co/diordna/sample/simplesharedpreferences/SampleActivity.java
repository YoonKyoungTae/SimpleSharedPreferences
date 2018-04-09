package kr.co.diordna.sample.simplesharedpreferences;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import kr.co.diordna.simplesharedpreferences.SSP;

/**
 * Created by ryans on 2018-04-03.
 */

public class SampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        SSP.init(this);

        SSP.openEdit()
                .put("KEY1", "ABC")
                .put("KEY2", "ABC")
                .put("KEY3", "ABC")
                .put("KEY4", "ABC")
                .put("KEY5", "ABC")
                .put("KEY6", "ABC")
                .put("KEY7", "ABC")
                .apply();

        String value = SSP.getString("KEY1", "default");
    }
}
