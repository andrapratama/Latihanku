package com.andra.latihanku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button btnLayout, btnMD;
    RelativeLayout introMessage;
    LinearLayout appContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introMessage = (RelativeLayout) findViewById(R.id.welcome_pesan);
        appContent = (LinearLayout) findViewById(R.id.content_layout);
        btnLayout = (Button)findViewById(R.id.button1);
        btnMD = (Button)findViewById(R.id.button2);

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MateriLayout.class);
                startActivity(intent);
            }
        });

        btnMD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MaterialDesign.class);
                startActivity(intent);
            }
        });
    }

    public void dismisWelcomeMessageBox(View view) {
        introMessage.setVisibility(View.INVISIBLE);
        appContent.setVisibility(View.VISIBLE);
    }
}
