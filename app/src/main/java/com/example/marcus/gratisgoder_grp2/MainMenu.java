package com.example.marcus.gratisgoder_grp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{

    Button goToFreeStuff, goToAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button goToFreeStuff = (Button) findViewById(R.id.goToFreeStuff);
        Button goToAdd = (Button) findViewById(R.id.goToAddStuff);
        Button goToList = (Button) findViewById(R.id.goToList);

        goToAdd.setOnClickListener(this);
        goToFreeStuff.setOnClickListener(this);
        goToList.setOnClickListener(this);

    }
        public void onClick(View view){
        switch(view.getId()) {
            case R.id.goToAddStuff:
                System.err.println("not yet implemented");
                break;
            case R.id.goToFreeStuff:
                Intent toolbarIntent = new Intent(this, ToolbarActivity.class);
                startActivity(toolbarIntent);
                break;
            case R.id.goToList:
                Intent liste = new Intent(this, Liste.class);
                startActivity(liste);
                break;
            default:
                System.err.println("onClick method undefined");
        }
    }
}

