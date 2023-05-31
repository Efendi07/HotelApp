package com.mnurulefendi202102256.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = findViewById(R.id.imageView1);

        String imageUrl = "https://i.pinimg.com/564x/ac/52/29/ac5229a13c72884deef1cad5209cce58.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}