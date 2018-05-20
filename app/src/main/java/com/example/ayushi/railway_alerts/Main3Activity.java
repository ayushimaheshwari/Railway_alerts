package com.example.ayushi.railway_alerts;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Main3Activity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private ProgressBar progressbar;
    private FirebaseAuth firebaseauth;
    String PINString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button submit;
        progressbar = new ProgressBar(this);
        progressDialog =new ProgressDialog(this);
        firebaseauth = FirebaseAuth.getInstance();
       final EditText e1,e2,e3;
        e1 = (EditText) findViewById(R.id.editText4);
        e2 = (EditText) findViewById(R.id.editText5);
        e3=(EditText)findViewById(R.id.editText3);
        submit=(Button)findViewById(R.id.button4);
        Intent i= getIntent();
        Intent j = getIntent();
        final String number = i.getStringExtra ( "abc ");
        //final String password = j.getStringExtra ( " " );
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //  String   number = e1.getText().toString().trim();
            //  String  password = e2.getText().toString().trim();


                firebaseauth.createUserWithEmailAndPassword(number, "qqqqqqqq")
                        .addOnCompleteListener(Main3Activity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                Toast.makeText(Main3Activity.this, " sucessfully registered" , Toast.LENGTH_SHORT).show();
                                setIntent(new Intent(com.example.ayushi.railway_alerts.Main3Activity.this,com.example.ayushi.railway_alerts.MainActivity.class));
                                startActivity(getIntent());
                                progressbar.setVisibility(View.GONE);
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                if (!task.isSuccessful()) {
                                    Toast.makeText(Main3Activity.this, "Authentication failed." ,
                                            Toast.LENGTH_SHORT).show();
                                }


                            }
                        });

            }
        });
    }
}
