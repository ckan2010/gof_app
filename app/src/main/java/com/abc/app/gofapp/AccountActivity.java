package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class AccountActivity extends Activity implements View.OnClickListener{
    Spinner sp_menu;
    TextView tv_gof,tv_email,tv_phone,tv_cardno,bt_payment,tv_service;
    SearchView sv_find;
    Button bt_update,bt_membership,bt_service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        sv_find = (SearchView) findViewById(R.id.sv_find);
        bt_update = (Button) findViewById(R.id.bt_update);
        bt_membership = (Button) findViewById(R.id.bt_membership);
        bt_service = (Button) findViewById(R.id.bt_service);
        tv_email = (TextView) findViewById(R.id.tv_email);
        tv_phone = (TextView) findViewById(R.id.tv_phone);
        tv_cardno = (TextView) findViewById(R.id.tv_cardno);
        bt_payment = (TextView) findViewById(R.id.bt_payment);
        tv_service = (TextView) findViewById(R.id.tv_service);
        tv_gof.setOnClickListener(this);
        sv_find.setOnClickListener(this);
        bt_update.setOnClickListener(this);
        bt_membership.setOnClickListener(this);
        bt_service.setOnClickListener(this);
        /*
        sp_menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(AccountActivity.this,PopVideoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(AccountActivity.this,NewVideoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(AccountActivity.this,MyVideoActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(AccountActivity.this,AccountActivity.class);
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
                startActivity(new Intent(this, MemberUpdateActivity.class));
                break;
            case R.id.bt_membership:
                break;
            case R.id.bt_service:
                break;
        }
    }
}
