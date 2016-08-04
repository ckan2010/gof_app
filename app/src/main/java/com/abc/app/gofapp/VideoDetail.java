package com.abc.app.gofapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class VideoDetail extends Activity implements View.OnClickListener{
    Spinner sp_menu;
    TextView tv_gof,tv_openyear,tv_grade,tv_runningtime,tv_synop,tv_ledingactor,tv_category,tv_carecter,tv_awarded;
    SearchView sv_find;
    ImageView iv_my_poster;
    Button bt_myvideolist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail2);
        sp_menu = (Spinner) findViewById(R.id.sp_menu);
        tv_gof = (TextView) findViewById(R.id.tv_gof);
        tv_openyear = (TextView) findViewById(R.id.tv_openyear);
        tv_grade = (TextView) findViewById(R.id.tv_grade);
        tv_runningtime = (TextView) findViewById(R.id.tv_runningtime);
        tv_synop = (TextView) findViewById(R.id.tv_synop);
        tv_ledingactor = (TextView) findViewById(R.id.tv_ledingactor);
        tv_category = (TextView) findViewById(R.id.tv_category);
        tv_carecter = (TextView) findViewById(R.id.tv_carecter);
        tv_awarded = (TextView) findViewById(R.id.tv_awarded);
        sv_find = (SearchView) findViewById(R.id.sv_find);
        iv_my_poster = (ImageView) findViewById(R.id.iv_my_poster);
        bt_myvideolist = (Button) findViewById(R.id.bt_myvideolist);
        tv_gof.setOnClickListener(this);
        sv_find.setOnClickListener(this);
        iv_my_poster.setOnClickListener(this);
        bt_myvideolist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sp_menu:
                break;
            case R.id.tv_gof:
                startActivity(new Intent(this, BrowseActivity.class));
                break;
            case R.id.sv_find:
                startActivity(new Intent(this, FindVideoActivity.class));
                break;
            case R.id.iv_my_poster:
                startActivity(new Intent(this, VideoPlay.class));
                break;
            case R.id.bt_myvideolist:
                startActivity(new Intent(this, MyVideoActivity.class));
                break;
        }
    }
}
