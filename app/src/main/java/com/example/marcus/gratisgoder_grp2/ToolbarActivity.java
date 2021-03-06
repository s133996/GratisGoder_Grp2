package com.example.marcus.gratisgoder_grp2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToolbarActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar tb = (Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);

        ((Button)findViewById(R.id.button)).setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search_result, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                finish();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "Search button selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button:
                removeAllFragments();
                android.support.v4.app.Fragment landsdele = new Map_frag();
                android.support.v4.app.FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
                fragTrans.replace(R.id.fragment , landsdele).commit();
                break;
        }
    }

    public void removeAllFragments()
    {
        for(android.support.v4.app.Fragment fragment : getSupportFragmentManager().getFragments())
        {
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
    }
}
