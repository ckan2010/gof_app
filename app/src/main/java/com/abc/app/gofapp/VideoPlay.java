package com.abc.app.gofapp;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlay extends Activity implements View.OnClickListener{
    VideoView vv_video;
    Button bt_play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play2);
        vv_video = (VideoView) findViewById(R.id.vv_video);
        bt_play = (Button) findViewById(R.id.bt_play);
        bt_play.setOnClickListener(this);
        getWindow().setFormat(PixelFormat.UNKNOWN);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_play:

                String uriPath = "android.resource://com.abc.app.gofapp/"+R.raw.matrix;
                vv_video.setVideoPath(uriPath);
                MediaController mediaController = new
                        MediaController(this);
                mediaController.setAnchorView(vv_video);
                vv_video.setMediaController(mediaController);
                vv_video.start();
                /*aa*/
                break;
        }
    }
}
