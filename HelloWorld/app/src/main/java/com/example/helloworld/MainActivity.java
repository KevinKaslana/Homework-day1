package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view) {
        Log.v("message","button has been clicked.");
        edittext = (EditText)findViewById(R.id.editText);
        String input = edittext.getText().toString();
        output = (TextView)findViewById(R.id.output);
        output.setText(input);
    }
}
