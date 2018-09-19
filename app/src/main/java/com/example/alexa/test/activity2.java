package com.example.alexa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity
{
    private Button goHome;
    private CanvasView canvasView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        canvasView = findViewById(R.id.canvas);

        goHome = findViewById(R.id.goHome);
        goHome.setOnClickListener(new btnAction());
    }

    public void clearCanvas(View v)
    {
        canvasView.clearCanvas();
    }

    private void goToHome()
    {
        finish();
    }

    class btnAction implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            goToHome();
        }
    }
}
