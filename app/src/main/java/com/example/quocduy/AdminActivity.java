package com.example.quocduy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class AdminActivity extends AppCompatActivity {

    // Khai báo các TextView
    private TextView config;
    private TextView configProduct;
    private TextView member;
    private TextView showProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        // Ánh xạ các TextView từ layout
        config = findViewById(R.id.config);
        configProduct = findViewById(R.id.configProduct);
        member = findViewById(R.id.member);
        showProduct = findViewById(R.id.showProduct);

        // Thiết lập sự kiện onClick cho từng TextView
        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng đến ConfigAdminActivity
                startActivity(new Intent(AdminActivity.this, ConfigAdminActivity.class));
                finish(); // Kết thúc AdminActivity sau khi chuyển hướng
            }
        });

        configProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng đến ConfigProductActivity
                startActivity(new Intent(AdminActivity.this, ConfigProductActivity.class));
                finish(); // Kết thúc AdminActivity sau khi chuyển hướng
            }
        });

        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng đến MemberActivity
                startActivity(new Intent(AdminActivity.this, MemberActivity.class));
                finish(); // Kết thúc AdminActivity sau khi chuyển hướng
            }
        });

        showProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng đến ProductActivity
                startActivity(new Intent(AdminActivity.this, ProductActivity.class));
                finish(); // Kết thúc AdminActivity sau khi chuyển hướng
            }
        });
    }
}
