package com.example.jack.myapplication25tabs;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.app.FragmentTransaction;

/**
 * Created by jack on 6/5/15.
 */
public class TabListener implements ActionBar.TabListener {

    Fragment fragment;


    public TabListener(Fragment fragment){

        this.fragment = fragment;
    }




    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {
        fragmentTransaction.replace(R.id.fragmentContainer,fragment);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

        fragmentTransaction.remove(fragment);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }
}
