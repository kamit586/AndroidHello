package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AndroidHelloActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    
    public void setTextByButton(View view) {
        final TextView textView = (TextView) findViewById(R.id.totalView);
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        try {
        int calc = Integer.parseInt(editText1.getText().toString()) + Integer.parseInt((editText2.getText().toString()));
        textView.setText(calc+"");
        } catch (NumberFormatException nfe) {
        	 textView.setText("NAN");
        }

        

    }    
}