package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     ImageButton send;
     EditText name;
     TextView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (ImageButton) findViewById(R.id.sendButton);
        name = (EditText) findViewById(R.id.PersonName);
        w = (TextView) findViewById(R.id.welcom);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =name.getText().toString();
                w.setText("Hello "+s+" :)");

            }
        });
    }

}