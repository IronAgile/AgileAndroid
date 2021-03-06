package com.example.digo.androidagile;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by digo on 12/04/2018.
 */

public class Portrait extends Fragment {

    private TextView societe;
    private TextView nom;
    private TextView prenom;

    public static Portrait newInstance() {
        return new Portrait();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.portrait, container, false);

        this.societe = (TextView) myFragmentView.findViewById(R.id.societe);
        this.nom = (TextView) myFragmentView.findViewById(R.id.nom);
        this.prenom = (TextView) myFragmentView.findViewById(R.id.prenom);


        return myFragmentView;
    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

    }
}


