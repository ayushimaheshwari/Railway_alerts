package com.example.ayushi.railway_alerts;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = new ProgressBar(this);
        auth = FirebaseAuth.getInstance();

       // if (auth.getCurrentUser() != null) {
        //    startActivity(new Intent(MainActivity.this, MainActivity.class));
          //  finish();
        //}
        Button register;
        Button login;
        final EditText e3,e4;
        TextView t1;
        register=(Button) findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView2);
        login=(Button)findViewById(R.id.button);
        e3=(EditText)findViewById(R.id.editText);
        e4=(EditText)findViewById(R.id.editText2);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //to navigate to other page
              setIntent(new Intent(com.example.ayushi.railway_alerts.MainActivity.this,com.example.ayushi.railway_alerts.Main2Activity.class));
            startActivity(getIntent());
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e3.getText().toString();
                final String password = e4.getText().toString();
                 String  email1=email+"@gmail.com";
                if (TextUtils.isEmpty(email1)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

              //  progressBar.setVisibility(View.VISIBLE);

                //authenticate user
                /*auth.signInWithEmailAndPassword(email1, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        e4.setError(getString(R.string.minimum_password));
                                    } else {
                                        Toast.makeText(MainActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    }
                                } else {*/
                                    setIntent(new Intent(com.example.ayushi.railway_alerts.MainActivity.this,com.example.ayushi.railway_alerts.Main4Activity.class));
                                    startActivity(getIntent());
                                   // finish();
                              //  }
                          //  }
                      //  });

            }
        });
         t1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 setIntent(new Intent(com.example.ayushi.railway_alerts.MainActivity.this,com.example.ayushi.railway_alerts.Main5Activity.class));
             startActivity(getIntent());
             }
         });

    }
}
