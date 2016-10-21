package com.ex.rohit.memecreater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    public void createMeme(String topText, String bottomText) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(topText,bottomText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
