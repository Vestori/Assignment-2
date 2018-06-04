package com.aclass.cop4656.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addButton(View view ) {

        TextView numeroUno = findViewById(R.id.numberOne);
        TextView numeroDos = findViewById(R.id.numberTwo);

        int one = Integer.valueOf(numeroUno.getText().toString());
        int two = Integer.valueOf(numeroDos.getText().toString());

        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("NUMBER1", one);
        intent.putExtra("NUMBER2", two);
        startActivity(intent);

    }



}
