package vn.quanlyvatnuoi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import vn.quanlyvatnuoi.R;


public class themScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void back_login(View view) {
        Intent intent=new Intent(themScrollingActivity.this,MenuquanlyvatnuoiActivity.class);
        startActivity(intent);

    }
}
