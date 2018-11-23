package vn.quanlyvatnuoi.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vn.quanlyvatnuoi.R;


public class LoginActivity extends AppCompatActivity {
    private AutoCompleteTextView edTK;
    private EditText edpass;
    private Button btndangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login() {
        edTK = findViewById(R.id.edTK);
        edpass = findViewById(R.id.edpass);
        btndangnhap = findViewById(R.id.btndangnhap);
        btndangnhap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edTK.getText().toString().equals("admin") && edpass.getText().toString().equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(LoginActivity.this, "Đăng nhập thất bại liên hệ NPH để đăng nhập!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void back_login(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //b2 thiết lập thông tin (title,msđége,buttton
        builder.setTitle("Thông báo");
        builder.setMessage("Bạn có muốn thoát?");
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();
    }
}

