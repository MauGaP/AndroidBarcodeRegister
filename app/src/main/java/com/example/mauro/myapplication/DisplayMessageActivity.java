package com.example.mauro.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String barcode = intent.getStringExtra(MainActivity.BARCODE);
//        String product = intent.getStringExtra(MainActivity.PRODUCT);

        TextView barcode_sent = findViewById(R.id.barcode_show);
//        TextView product_name = findViewById(R.id.product_input);
        barcode_sent.setText(barcode);
//        product_name.setText(product);
    }
}
