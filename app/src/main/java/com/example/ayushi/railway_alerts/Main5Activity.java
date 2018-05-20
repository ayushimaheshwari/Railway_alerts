package com.example.ayushi.railway_alerts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button b;
        final EditText e;
       // String phone=null;
        e=(EditText)findViewById(R.id.editText8);
        b=(Button)findViewById(R.id.button5);
       //  phone= e.getText().toString();
       // final int number=Integer.parseInt(phone);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(e.getText().toString(),e.getText().toString(),"hii",null,null);
                Toast.makeText(getApplicationContext(), "message send", Toast.LENGTH_SHORT).show();

                setIntent(new Intent(com.example.ayushi.railway_alerts.Main5Activity.this,com.example.ayushi.railway_alerts.MainActivity.class));
                startActivity(getIntent());
            }
        });
    }
}
