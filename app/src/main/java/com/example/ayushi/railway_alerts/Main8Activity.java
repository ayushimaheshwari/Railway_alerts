package com.example.ayushi.railway_alerts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
         /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setIntent(new Intent(com.example.ayushi.railway_alerts.Main4Activity.this,com.example.ayushi.railway_alerts.Main7Activity.class));
           // startActivity(getIntent());

                NotificationCompat.Builder builder = new NotificationCompat.Builder(com.example.ayushi.railway_alerts.Main4Activity.this)
                        .setSmallIcon(R.drawable.ic_menu_camera).setContentTitle("Railway_alert").setContentText("your PNR is accepted. Now you can do train enquiry");
                Intent notificationIntent = new Intent(com.example.ayushi.railway_alerts.Main4Activity.this, Main7Activity.class);
                PendingIntent contentIntent = PendingIntent.getActivity(com.example.ayushi.railway_alerts.Main4Activity.this, 0, notificationIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0, builder.build());
            }
        });*/
    }
}
