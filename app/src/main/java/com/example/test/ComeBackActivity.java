package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComeBackActivity extends Activity {

    Button goback;
    Button send;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comebackactivity);
        goback = (Button)findViewById(R.id.btnback);
        send = (Button)findViewById(R.id.send);
        editText = (EditText)findViewById(R.id.EditText);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("et", editText.getText().toString());
                setResult(RESULT_OK, i);
                finish();
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ComeBackActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
