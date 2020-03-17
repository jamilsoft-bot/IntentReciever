package com.jamilsoft.intentreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null){
            String uri_string = "URL:"+uri.toString();

            textView = (TextView)findViewById(R.id.Recieve_Text);
            textView.setText(uri_string);
        }
    }
}
