package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class MemberUpdateActivity extends Activity implements View.OnClickListener{
    Spinner sp_menu;
    TextView tv_gof;
    SearchView sv_find;
    Button bt_update;
    EditText et_email,et_pw,et_phone,et_cardno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_update);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        sv_find = (SearchView) findViewById(R.id.sv_find);
        bt_update = (Button) findViewById(R.id.bt_update);
        et_email = (EditText) findViewById(R.id.et_email);
        et_pw = (EditText) findViewById(R.id.et_pw);
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_cardno = (EditText) findViewById(R.id.et_cardno);
        /*
        sp_menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MemberUpdateActivity.this,PopVideoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MemberUpdateActivity.this,NewVideoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MemberUpdateActivity.this,MyVideoActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MemberUpdateActivity.this,AccountActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:

                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        */
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_gof:
                startActivity(new Intent(this, BrowseActivity.class));
                break;
            case R.id.sv_find:
                startActivity(new Intent(this, FindVideoActivity.class));
                break;
            case R.id.bt_update:
                break;
        }
    }
}
