package kr.co.diordna.sample.simplesharedpreferences;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kr.co.diordna.simplesharedpreferences.SSP;

/**
 * Created by ryans on 2018-04-03.
 */

public class SampleActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_save_key;
    private EditText et_save_value;
    private Button btn_save;

    private EditText et_get_key;
    private Button btn_get;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        initView();
    }

    private void initView() {
        et_save_key = (EditText) findViewById(R.id.et_save_key);
        et_save_value = (EditText) findViewById(R.id.et_save_value);
        btn_save = (Button) findViewById(R.id.btn_save);

        et_get_key = (EditText) findViewById(R.id.et_get_key);
        btn_get = (Button) findViewById(R.id.btn_get);

        btn_save.setOnClickListener(this);
        btn_get.setOnClickListener(this);
    }

    private void onClickSave() {
        String key = et_save_key.getText().toString();
        String value = et_save_value.getText().toString();

        SSP.openEdit()
                .put(key, value)
                .commit();

        Toast.makeText(this, "Success Commit!", Toast.LENGTH_SHORT).show();
    }

    private void onClickGet() {
        String value = et_get_key.getText().toString();

        String msg = SSP.getString(value, "Default Message");

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                onClickSave();
                break;

            case R.id.btn_get:
                onClickGet();
                break;
        }
    }
}
