package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class mainPage extends AppCompatActivity {

    LinearLayout loginSection,ruleSection,visionSection,contactSection,aboutUsSection,messageSection,staffSection,NoticeSection;
    LinearLayout calendarSection;
    ImageView dev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        loginSection = findViewById(R.id.login_section);
        ruleSection = findViewById(R.id.rules_section);
        visionSection = findViewById(R.id.vision_section);
        contactSection = findViewById(R.id.contact_section);
        aboutUsSection = findViewById(R.id.about_us_section);
        messageSection = findViewById(R.id.message_section);
        staffSection = findViewById(R.id.staff_section);
        NoticeSection = findViewById(R.id.notice_section);
        calendarSection = findViewById(R.id.calendar_section);

        dev=findViewById(R.id.developerGear);


        loginSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,login.class);
                startActivity(intent);

            }
        });

        ruleSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,Rules.class);
                startActivity(intent);
            }
        });

        visionSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,Vision.class);
                startActivity(intent);
            }
        });

        contactSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,Contact.class);
                startActivity(intent);
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,Developer.class);
                startActivity(intent);
            }
        });

        aboutUsSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,about_club.class);
                startActivity(intent);
            }
        });
        messageSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,messages_by_chief.class);
                startActivity(intent);
            }
        });

        staffSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,staff_section.class);
                startActivity(intent);
            }
        });
        NoticeSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,dashboard.class);
                startActivity(intent);
            }
        });

        calendarSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainPage.this,calendar_page.class);
                startActivity(intent);
            }
        });

    }
}