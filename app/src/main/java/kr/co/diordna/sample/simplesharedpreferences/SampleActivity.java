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

        SSP.getInstance().init(this);
        SSP.getInstance()
                .put("A", "A")
                .put("B", "B")
                .put("C", "C")
                .commit();


    }
}
