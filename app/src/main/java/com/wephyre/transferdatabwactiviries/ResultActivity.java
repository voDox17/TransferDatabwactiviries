package com.wephyre.transferdatabwactiviries;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText =  findViewById(R.id.textView2);

        SharedPreferences resultPref = getSharedPreferences("MySavedValue",
                Context.MODE_PRIVATE);
        String finalResult = resultPref.getString("myValue", "data not found");
        resultText.setText(finalResult);
    }
}
