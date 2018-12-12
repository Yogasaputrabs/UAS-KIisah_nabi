package com.example.filman_gf.kisah_nabi;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    Button button3,button4;
    Button button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ulul Azmi adalah", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), layuot_ulul_azmi.class);
                startActivities(new Intent[]{intent});
            }
        });

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Kisah Nabi Nuh", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NabiNuh.class);
                startActivities(new Intent[]{intent});
            }
        });

        button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Kisah Nabi Ibrahim", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NabiIbrahim.class);
                startActivities(new Intent[]{intent});
            }
        });

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kisah Nabi Musa", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NabiMusa.class);
                startActivities(new Intent[]{intent});
            }
        });

        button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kisah Nabi Isa", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NabiIsa.class);
                startActivities(new Intent[]{intent});
            }
        });

        button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Kisah Nabi Muhammad", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), NabiMuhammad.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
