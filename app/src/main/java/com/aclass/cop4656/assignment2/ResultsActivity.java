package com.aclass.cop4656.assignment2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        int number1 = getIntent().getIntExtra("NUMBER1", 0);
        int number2 = getIntent().getIntExtra("NUMBER2", 0);

        TextView resultsView = findViewById(R.id.resultView);
        resultsView.setText("The result is: " + Integer.toString((number1 + number2)));

    }
}
