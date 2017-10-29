package com.example.administrator.saveqq;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"正在登录，请稍后...", Toast.LENGTH_SHORT).show();
                ProgressDialog prodialog;
                prodialog = new ProgressDialog(MainActivity.this);
                prodialog.setTitle("进度条对话框");
                prodialog.setIcon(R.mipmap.ic_launcher);
                prodialog.setMessage("正在登陆请稍候...");
                prodialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                prodialog.show();

            }
        });

    }
}
