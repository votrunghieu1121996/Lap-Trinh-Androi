package com.example.student.vth_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {
    EditText edtTaiKhoan, edtMatKhau;
    CheckBox ckLuuThongTin;
    Button btnDangNhap, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast;
                if(ckLuuThongTin.isChecked())
                {
                    //String noiDung = ckLuuThongTin.getText().toString();
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu.", Toast.LENGTH_LONG ).show();
                }
                Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu.", Toast.LENGTH_LONG ).show();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder  adl = new AlertDialog.Builder(MainActivity.this);
                adl.setTitle("Thông Báo");
                adl.setMessage("Bạn có muốn thoát không ").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alert = adl.create();
                alert.show();
            }
        });

    }
    private  void AnhXa(){
       edtTaiKhoan = (EditText) findViewById(R.id.edtTaiKhoan);
       edtMatKhau = (EditText) findViewById(R.id.edtMatKhau);
       ckLuuThongTin = (CheckBox) findViewById(R.id.ckLuuThongTin);
       btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
       btnThoat = (Button) findViewById(R.id.btnThoat);
    }
}
