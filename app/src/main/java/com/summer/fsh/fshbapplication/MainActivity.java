package com.summer.fsh.fshbapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    PackageManager packageManager = getApplication().getPackageManager();
                    Intent it = packageManager.getLaunchIntentForPackage("com.summer.fsh.fshaapplication");
                    startActivity(it);

                } catch (Exception e) {
                }
                try {
                    Thread.sleep(4000);
                    Intent intent2=new Intent();
                    //设置Action
                    intent2.setAction("cc.test");
                    //携带数据
                    intent2.putExtra("name", "周星驰");
                    intent2.putExtra("number", 9527);
                    //发送广播
                    sendBroadcast(intent2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
