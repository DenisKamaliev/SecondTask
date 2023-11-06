package com.example.secondtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = findViewById(R.id.buttonCrowsCounter);
        TextView helloTextView = findViewById(R.id.textView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });


    }
    private int mCount = 0;

    public void onClick(View view){
        TextView helloTextView = findViewById(R.id.textView);
        helloTextView.setText("Hello Kitty!");

    }
}