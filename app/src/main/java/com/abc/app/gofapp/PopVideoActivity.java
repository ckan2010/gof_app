package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class PopVideoActivity extends Activity implements View.OnClickListener{
    Spinner sp_menu;
    TextView tv_gof;
    SearchView sv_find;
    ImageView iv_pop_poster,iv_pop_poster1,iv_pop_poster2,iv_pop_poster3,iv_pop_poster4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_video);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        sv_find = (SearchView) findViewById(R.id.sv_find);
        iv_pop_poster = (ImageView) findViewById(R.id.iv_pop_poster);
        iv_pop_poster1 = (ImageView) findViewById(R.id.iv_pop_poster1);
        iv_pop_poster2 = (ImageView) findViewById(R.id.iv_pop_poster2);
        iv_pop_poster3 = (ImageView) findViewById(R.id.iv_pop_poster3);
        iv_pop_poster4 = (ImageView) findViewById(R.id.iv_pop_poster4);
        tv_gof.setOnClickListener(this);
        sv_find.setOnClickListener(this);
        iv_pop_poster.setOnClickListener(this);
        iv_pop_poster1.setOnClickListener(this);
        iv_pop_poster2.setOnClickListener(this);
        iv_pop_poster3.setOnClickListener(this);
        iv_pop_poster4.setOnClickListener(this);
        /*
        sp_menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(PopVideoActivity.this,PopVideoActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(PopVideoActivity.this,NewVideoActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(PopVideoActivity.this,MyVideoActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(PopVideoActivity.this,AccountActivity.class);
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
            case R.id.iv_pop_poster:
                startActivity(new Intent(this, VideoDetail.class));
                break;
            case R.id.iv_pop_poster1:
                startActivity(new Intent(this, VideoDetail.class));
                break;
            case R.id.iv_pop_poster2:
                startActivity(new Intent(this, VideoDetail.class));
                break;
            case R.id.iv_pop_poster3:
                startActivity(new Intent(this, VideoDetail.class));
                break;
            case R.id.iv_pop_poster4:
                startActivity(new Intent(this, VideoDetail.class));
                break;
        }
    }
}
