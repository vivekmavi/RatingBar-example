package com.example.paras.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    RatingBar ratingBar1 , ratingBar2 , ratingBar3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar1 = (RatingBar) findViewById(R.id.indicatorRatingbar);
        ratingBar2 = (RatingBar) findViewById(R.id.ratingbar2);
        ratingBar3 = (RatingBar) findViewById(R.id.ratingbar3);

        ratingBar2.setOnRatingBarChangeListener(this);
        ratingBar3.setOnRatingBarChangeListener(this);

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float newRating, boolean isRatingChanged)
    {
     if(isRatingChanged)
     {
      if (ratingBar==ratingBar2)
       {
        ratingBar1.setRating(newRating);
       }
        if (ratingBar==ratingBar3)
        {
         Toast.makeText(this,"rating on 3rd bar is "+String.valueOf(newRating),Toast.LENGTH_SHORT).show();
        ratingBar1.setRating(0);
            ratingBar2.setRating(1);
        }
     }
    }
}

