package com.dmw.eteachswayam.exo.fragment.tab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dmw.eteachswayam.R;


public class SelfFragment extends Fragment {


  /*  public SelfFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
*/
    @Override
    public
    View onCreateView( LayoutInflater inflater, ViewGroup container,
                       Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_self, container, false);
    }

}
