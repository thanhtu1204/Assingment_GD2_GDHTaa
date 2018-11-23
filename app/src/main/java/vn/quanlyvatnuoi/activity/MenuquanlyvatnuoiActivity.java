package vn.quanlyvatnuoi.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import vn.quanlyvatnuoi.R;


public class MenuquanlyvatnuoiActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuquanlyvatnuoi);
        addControl();
    }

    private void addControl() {
        viewPager = findViewById(R.id.View_page);
        tabLayout = findViewById(R.id.tab_layout);
        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapter adapter = new pageAdptermenuqlvt(fragmentManager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
    }
    public void Onclickcathe(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //b2 thiết lập thông tin (title,msđége,buttton
        builder.setTitle("Cá Thể");
        builder.setMessage("Bò:\n Gà:\n Ngan:\n");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }
    public void onclicksoluong(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //b2 thiết lập thông tin (title,msđége,buttton
        builder.setTitle("Số Lượng");
        builder.setMessage("Tổng Đàn :");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }

    public void onClickqlchiphi(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //b2 thiết lập thông tin (title,msđége,buttton
        builder.setTitle("Chi Phí");
        builder.setMessage("Tổng Chi Phí :");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();

    }
    public void Onclickthem(View view){
        Intent intent=new Intent(MenuquanlyvatnuoiActivity.this,themScrollingActivity.class);
        startActivity(intent);

    }

    public void onclicksua(View view){
        Intent intent=new Intent(MenuquanlyvatnuoiActivity.this,SuaScrollingActivity.class);
        startActivity(intent);

    }
    public void onClickqxoa(View view){
        Intent intent=new Intent(MenuquanlyvatnuoiActivity.this,XoaVNActivity.class);
        startActivity(intent);
    }
    public void onClickqtheodoi(View view){

    }
}
