package com.animeshjain.assignment102;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jain on 10-12-2017.
 */

public class DescriptionFrag extends Fragment {

    public  DescriptionFrag(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View descriptionFrag= inflater.inflate(R.layout.description_frag, container, false);

        String[] des= {"sdf","sdfg","wertry","r3465657756"};

        int i=0;
        TextView textView= (TextView) descriptionFrag.findViewById(R.id.desTxt);
        textView.setText(des[i]);
        return descriptionFrag;
    }
}
