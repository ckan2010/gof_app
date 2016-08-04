package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FindVideoActivity extends Activity implements View.OnClickListener{
    Button bt_find;
    ImageView iv_poster,iv_poster1,iv_poster2,iv_poster3;
    TextView tv_poster,tv_gof;
    EditText et_find;
    Spinner sp_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_video);
        bt_find = (Button) findViewById(R.id.bt_find);
        iv_poster = (ImageView) findViewById(R.id.iv_poster);
        iv_poster1 = (ImageView) findViewById(R.id.iv_poster1);
        iv_poster2 = (ImageView) findViewById(R.id.iv_poster2);
        iv_poster3 = (ImageView) findViewById(R.id.iv_poster3);
        tv_poster = (TextView) findViewById(R.id.tv_poster);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        et_find = (EditText) findViewById(R.id.et_find);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        bt_find.setOnClickListener(this);
        iv_poster.setOnClickListener(this);
        iv_poster1.setOnClickListener(this);
        iv_poster2.setOnClickListener(this);
        iv_poster3.setOnClickListener(this);
        tv_gof.setOnClickListener(this);
        Toast.makeText(this,"FindActivity",Toast.LENGTH_SHORT).show();
        /*
        sp_menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(FindVideoActivity.this,PopVideoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(FindVideoActivity.this,NewVideoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(FindVideoActivity.this,MyVideoActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(FindVideoActivity.this,AccountActivity.class);
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
        switch (v.getId()){
            case R.id.tv_gof:
                Toast.makeText(FindVideoActivity.this,"find",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,BrowseActivity.class));
                break;
            case R.id.bt_find:
                break;
            case R.id.iv_poster:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_poster1:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_poster2:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_poster3:
                startActivity(new Intent(this,VideoDetail.class));
                break;
        }
    }
}
