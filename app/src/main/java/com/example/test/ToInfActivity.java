package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ToInfActivity extends Activity {

    TextView text;
    Button goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toinfactivity);
        String str = getIntent().getStringExtra("et");
        goBack = (Button)findViewById(R.id.button_toinf);
        text = (TextView) findViewById(R.id.textView2);
        if (!str.equals("")) {
            text.setText(str);
        }
        else{
            text.setText("Вы ничего не ввели(");
        }
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ToInfActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}
