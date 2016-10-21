package com.ex.rohit.memecreater;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.print.PrintHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {

    private static TextView TopText;
    private static TextView BottomText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.bottom_picture_fragment, container,false);

        TopText = (TextView) view.findViewById(R.id.TopText);
        BottomText = (TextView)view.findViewById(R.id.BottomText);



        return view;
    }

    public void setMemeText(String top,String bottom)
    {
        TopText.setText(top);
        BottomText.setText(bottom);
    }
}
