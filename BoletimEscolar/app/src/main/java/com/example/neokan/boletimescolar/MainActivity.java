package com.example.neokan.boletimescolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard report = new ReportCard(2018,1);

        report.setNotaGeografia("C");

        Log.v("onCreate","Nota Georgrafia Atualizada:" + report.getNotaGeografia());

        Log.v("onCreate",report.toString());

        ReportCard report2 = new ReportCard(2018,1, "A","B","C","D","E","F");

        report2.setNotaHistoria("A");

        Log.v("onCreate","Nota História Atualizada:" + report2.getNotaHistoria());

        Log.v("onCreate",report2.toString());
    }
}
