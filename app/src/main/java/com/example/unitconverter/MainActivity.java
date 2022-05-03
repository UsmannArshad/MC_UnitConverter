package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textview;
private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        edittext=findViewById(R.id.editTextTextPersonName);
        textview=findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kgval=edittext.getText().toString();
                int kilogram=Integer.parseInt(kgval);
                double pound=kilogram*2.205;
                textview.setText("The corresponding value in pounds is "+pound);
            }
        });


    }
    public void ConvertPound2Kg(View view)
    {
        String poundval=edittext.getText().toString();
        int pound=Integer.parseInt(poundval);
        double kilogram=pound/2.205;
        String kg=String.format("%.2f",kilogram);
        textview.setText("The corresponding value in kgs is "+kg);
    }
}