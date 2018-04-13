package com.sg.time;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;

public class ValActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_val);

        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);
        TextView tvData3 = (TextView) findViewById(R.id.tv_data3);
        TextView tvData4 = (TextView) findViewById(R.id.tv_data4);

        tvData1.setText(getIntent().getStringExtra("nama"));
        tvData2.setText(getIntent().getStringExtra("tanggal"));
        tvData3.setText(getIntent().getStringExtra("waktu"));
        String isi=getIntent().getStringExtra("jenis");
        tvData4.setText(isi);


        Button btnback = (Button) findViewById(R.id.button1);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(ValActivity.this, MainActivity.class));
                finish();
            }
        });

        Button btn2 =(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);
            }
        });

    }
}
