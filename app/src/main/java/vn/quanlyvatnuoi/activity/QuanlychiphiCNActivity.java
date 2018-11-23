package vn.quanlyvatnuoi.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vn.quanlyvatnuoi.R;


public class QuanlychiphiCNActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlychiphi_cn);
    }

    public void back_login(View view) {
        Intent intent=new Intent(QuanlychiphiCNActivity.this,MenuquanlyvatnuoiActivity.class);
        startActivity(intent);
    }
}
