package com.example.checkdate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText txtDay, txtMonth, txtYear;
    Button btnCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDay = (EditText)findViewById(R.id.txtDay);
        txtMonth = (EditText)findViewById(R.id.txtMonth);
        txtYear = (EditText)findViewById(R.id.txtYear);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnCheck = (Button)findViewById(R.id.btnCheck);
    }

    public void checkValidDate(View view) {
        String day = txtDay.getText().toString().trim();
        String month = txtMonth.getText().toString().trim();
        String year = txtYear.getText().toString().trim();
        boolean check = DateUtils.checkDateValidationOK(day, month, year);
        if (check == true) {
            txtResult.setText("Valid Date!");
            txtResult.setTextColor(Color.parseColor("#0F9D58"));
        } else {
                txtResult.setText("Invalid Date!");
                txtResult.setTextColor(Color.parseColor("#FF0000"));
        }
    }

    public void reset(View view) {
        txtDay.setText("");
        txtMonth.setText("");
        txtYear.setText("");
        txtResult.setText("");
    }
}