package com.example.hoshiraku.turtelapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stanford.androidlib.SimpleActivity;

public class TurtelActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtel);
    }

    public void radioClick(View view) {
        int id = view.getId();

        ImageView img = $IV(R.id.turtle_image);


        if(id == R.id.dan_button){
            img.setImageResource(R.drawable.dan);
        }else if(id == R.id.yan_button){
            img.setImageResource(R.drawable.yan);
        }else if(id == R.id.hoshi_button){
            img.setImageResource(R.drawable.hoshi);
        }else if(id == R.id.steven_button){
            img.setImageResource(R.drawable.steven);
        }else{
            // do nothing
        }

    }
}
