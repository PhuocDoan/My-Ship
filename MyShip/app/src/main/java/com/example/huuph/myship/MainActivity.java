package com.example.huuph.myship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickLogin(View view) {
        //TODO gửi lên firrebase và check acc (Phước)
    }

    public void ocClickAnotherAcc(View view) {
        //TODO Chuyển sang một activity out mới gồm những chọn lựa như đăng nhập bằng facebook, google, tiwter (Bình)
    }

    public void onClickSignUp(View view) {
        //TODO Chuyển sang activity đăng kí
    }

    public void onClickFogotpass(View view) {
        //TODO Chuyển sang layout quên mật khẩu
    }
}
