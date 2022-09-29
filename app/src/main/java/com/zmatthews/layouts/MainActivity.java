package com.zmatthews.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateLayoutCorners(View view) {
        setContentView(R.layout.layout0_corners);
    }

    public void navigateLayoutChecker(View view) {
        setContentView(R.layout.layout1_checker);
    }

    public void navigateLayoutGuideline(View view) {
        setContentView(R.layout.layout2_guideline);
    }

    public void navigateLayoutOverlap(View view) {
        setContentView(R.layout.layout3_overlap);
    }

    public void navigateLayoutScrollText(View view) {
        setContentView(R.layout.layout4_scrolltext);
    }

    public void navigateLayoutScrollButtons(View view) {
        setContentView(R.layout.layout5_scrollbuttons);
    }

    public void navigateLayoutScrollCheckboxes(View view) {
        setContentView(R.layout.layout6_scrollcheckboxes);
    }
}