package com.basic.quiz.cookies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.basic.quiz.cookies.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Perform View Binding
        activityMainBinding = ActivityMainBinding.inflate(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        setContentView(activityMainBinding.getRoot());
    }

    /**
     * Update the ImageView and TextView.
     *
     * @param view is the clicked "Eat Cookie" Button.
     */
    public void eatCookie(View view) {
        // Change ImageView
        activityMainBinding.imageCookie.setImageDrawable(
                AppCompatResources.getDrawable(this, R.drawable.after_cookie));
        // Change TextView
        activityMainBinding.textStatus.setText(R.string.statusFull);
    }
}