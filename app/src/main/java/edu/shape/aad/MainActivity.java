package edu.shape.aad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onDisplayClicked(View v) {
        et = findViewById(R.id.editText);
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello " + et.getText().toString());
    }
}