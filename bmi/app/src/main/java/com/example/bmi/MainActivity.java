package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private  TextView lblOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         lblOutput = (TextView) findViewById(R.id.lblOutput);
        lblOutput.setTextSize(36);
        Button btnCount = (Button) findViewById(R.id.btnCount);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnCount.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText edtTextHeight = (EditText) findViewById(R.id.edtTextHeight);
        EditText edtTextWeight = (EditText) findViewById(R.id.edtTextWeight);

        if (v.getId() == R.id.btnCount){
            double height = Double.parseDouble(edtTextHeight.getText().toString());
            double weight = Double.parseDouble(edtTextWeight.getText().toString());
            double bmi = weight / Math.pow(height/100.0 , 2);
            if (bmi >= 24)
                lblOutput.setTextColor(Color.RED);
            else if(bmi < 18.5)
                lblOutput.setTextColor(Color.BLUE);
            else
                lblOutput.setTextColor(Color.GREEN);

            lblOutput.setText(String.format("%.2f",bmi));
        }
        else {
            edtTextHeight.setText("0");
            edtTextWeight.setText("0");
            lblOutput.setText("");
        }

    }
}