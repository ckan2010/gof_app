package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class MyVideoActivity extends Activity implements View.OnClickListener{
    Spinner sp_menu;
    TextView tv_gof;
    SearchView sv_find;
    ImageView iv_my_poster,iv_my_poster1,iv_my_poster2,iv_my_poster3,iv_my_poster4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_video);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        sv_find = (SearchView) findViewById(R.id.sv_find);
        tv_gof.setOnClickListener(this);
        sv_find.setOnClickListener(this);
        iv_my_poster = (ImageView) findViewById(R.id.iv_my_poster);
        iv_my_poster1 = (ImageView) findViewById(R.id.iv_my_poster1);
        iv_my_poster2 = (ImageView) findViewById(R.id.iv_my_poster2);
        iv_my_poster3 = (ImageView) findViewById(R.id.iv_my_poster3);
        iv_my_poster4 = (ImageView) findViewById(R.id.iv_my_poster4);
        tv_gof.setOnClickListener(this);
        sv_find.setOnClickListener(this);
        iv_my_poster.setOnClickListener(this);
        iv_my_poster1.setOnClickListener(this);
        iv_my_poster2.setOnClickListener(this);
        iv_my_poster3.setOnClickListener(this);
        iv_my_poster4.setOnClickListener(this);
        /* aaaaaa
        sp_menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MyVideoActivity.this,PopVideoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MyVideoActivity.this,NewVideoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MyVideoActivity.this,MyVideoActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MyVideoActivity.this,AccountActivity.class);
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
                startActivity(new Intent(this,BrowseActivity.class));
                break;
            case R.id.sv_find:
                startActivity(new Intent(this,BrowseActivity.class));
                break;
            case R.id.iv_my_poster:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_my_poster1:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_my_poster2:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_my_poster3:
                startActivity(new Intent(this,VideoDetail.class));
                break;
            case R.id.iv_my_poster4:
                startActivity(new Intent(this,VideoDetail.class));
                break;
        }
    }
}
