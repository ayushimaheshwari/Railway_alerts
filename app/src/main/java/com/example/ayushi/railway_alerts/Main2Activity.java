package com.example.ayushi.railway_alerts;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    private ProgressDialog progressDialog;
  //  private ProgressBar progressbar;
   // private FirebaseAuth firebaseauth;
    String PINString;
    public String number;
    public String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

   //     progressbar = new ProgressBar(this);
        progressDialog =new ProgressDialog(this);
        Button register;
        final EditText e1, e2;

        e1 = (EditText) findViewById(R.id.editText5);

        e2 = (EditText) findViewById(R.id.editText4);
        register = (Button) findViewById(R.id.button3);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //     number = number + "@gmail.com";
                //   String   number = e1.getText().toString().trim();

                 number = e2.getText().toString().trim();
                 password = e1.getText().toString().trim();
                int randomPIN = (int) (Math.random() * 9000) + 1000;
                PINString = String.valueOf(randomPIN);
                // e1.setText(PINString);
                if (TextUtils.isEmpty(number)) {
                    //number is empty
                    Toast.makeText(Main2Activity.this, "please enter mobile number", Toast.LENGTH_SHORT).show();
                    return;
                } else if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Main2Activity.this, "please enter password", Toast.LENGTH_SHORT).show();
                    return;
                    //password is empty
                }
                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                  //  SmsManager smsManager = SmsManager.getDefault();
                    //smsManager.sendTextMessage(number, null, "Dear User your 4-Digit OTP code is"+PINString, null, null);
                    //Toast.makeText(getApplicationContext(), "SMS Sent!",
                      //      Toast.LENGTH_LONG).show();
                    Intent www = new Intent(com.example.ayushi.railway_alerts.Main2Activity.this,com.example.ayushi.railway_alerts.Main3Activity.class);
               //     setIntent(new Intent(com.example.ayushi.railway_alerts.Main2Activity.this,com.example.ayushi.railway_alerts.Main3Activity.class));
                    www.putExtra("abc",number);
                    //getIntent().putExtra("xyz",password);
                    startActivity(www);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again later!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }



            }

        });


    }

}