package com.example.jimmy.solitaire;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import com.example.jimmy.solitaire.R;

/**
 * Created by Amritpal on 4/15/2016.
 */
public class SecondActivityFragment extends Fragment {

    public SecondActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}
