package com.example.marcus.gratisgoder_grp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar tb = (Toolbar)findViewById(R.id.my_toolbar);

        setSupportActionBar(tb);

    }
}
