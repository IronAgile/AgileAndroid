package com.example.digo.androidagile;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.app.Fragment;

public class MainActivity extends FragmentActivity {

    private static final String TAG_P = "portrait";
    private static final String TAG_L = "paysage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation = getResources().getConfiguration().orientation;

        FragmentManager fm = getFragmentManager();

       // final Fragment portraitFrag = Portrait.newInstance();
        final Fragment portraitFrag = new Portrait();
        final Fragment paysageFrag = Paysage.newInstance();


        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            Fragment fragTAG = fm.findFragmentByTag(TAG_P);
            if(fragTAG == null){
                Log.e("fragment","creation fragment portrait");
                fm.beginTransaction().replace(R.id.frag, portraitFrag, TAG_P).commit(); //Portrait
            } else{
                fm.beginTransaction().replace(R.id.frag,fragTAG).commit();
                Log.e("fragment","non null ");

            }
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Fragment fragTAG = fm.findFragmentByTag(TAG_L);
            if (fragTAG == null) {
                Log.e("fragment", "creation fragment paysage");
                fm.beginTransaction().replace(R.id.frag, paysageFrag, TAG_L).commit(); //Portrait
            } else {
                fm.beginTransaction().replace(R.id.frag, fragTAG).commit();
                Log.e("fragment","non null ");
            }
            Toast.makeText(this, "paysage", Toast.LENGTH_SHORT).show();
        }

    }
}

