package com.example.neokan.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupClickListener(R.id.txtListButton, ListActivity.class);

        setupClickListener(R.id.txtSearchButton, SearchActivity.class);

        setupClickListener(R.id.txtRandomButton, RandomActivity.class);

        setupClickListener(R.id.txtPaymentButton, PaymentActivity.class);
    }

    private void setupClickListener(int id, final Class activityClass){
        View view = findViewById(id);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
    }
}
