package com.abc.app.gofapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{
    EditText et_email,et_pw;
    Button bt_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_email = (EditText) findViewById(R.id.et_email);
        et_pw = (EditText) findViewById(R.id.et_pw);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:

                break;
        }
    }
}
