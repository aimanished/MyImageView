package com.example.a16031940.myimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image2 = (ImageView)findViewById(R.id.imageView2);
        image2.setImageResource(R.drawable.day2);

    }
}
