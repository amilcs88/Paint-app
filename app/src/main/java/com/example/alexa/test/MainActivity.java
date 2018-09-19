package com.example.alexa.test;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.math.*;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    private Button color;
    private TextView change;
    private TextView stats;
    private Button draw;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = findViewById(R.id.button2);
        color.setOnClickListener(new View.OnClickListener()
        {
             public void onClick(View v)
            {
                change = findViewById(R.id.editText);
                stats = findViewById(R.id.textView);
                Random rand = new Random();
                int r, g, b;
                r = rand.nextInt(256);
                g = rand.nextInt(256);
                b = rand.nextInt(256);
                int color = Color.rgb(r,g,b);

                change.setTextColor(color);
                int crtColor = change.getCurrentTextColor();
                String colorStat = String.format("#%06x", (0xFFFFFF & crtColor));


                stats.setText("color:" + "r "+r+", b "+b+ ", g "+g+", " +colorStat );
            }
        });

        draw = findViewById(R.id.draw);
        draw.setOnClickListener(new btnAction());


    }
    //called from onClick
    //edit this method
    private void randColorClicked()
    {


    }
    private void goToDraw()
    {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
    class btnAction implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {

            switch(v.getId())
            {

                case R.id.draw:
                    goToDraw();
                    break;
            }
        }
    }

}
