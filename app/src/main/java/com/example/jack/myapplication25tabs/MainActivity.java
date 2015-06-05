package com.example.jack.myapplication25tabs;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {


    Fragment fragment1 = new TabFragment1();
    Fragment fragment2 = new TabFragment2();
    Fragment fragment3 = new TabFragment3();

    ActionBar.Tab tab1,tab2,tab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();



        tab1 = actionBar.newTab().setText("TabUp1");
        tab2 = actionBar.newTab().setText("TabUp2");
        tab3 = actionBar.newTab().setText("TabUp3");

        tab1.setTabListener(new TabListener(fragment1));
        tab2.setTabListener(new TabListener(fragment2));
        tab3.setTabListener(new TabListener(fragment3));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        actionBar.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
