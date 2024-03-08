package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class registration extends AppCompatActivity {

    EditText email,password;
    TextView signInBtn;
    ImageView pass_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        signInBtn=findViewById(R.id.signInBtn);
        pass_img = findViewById(R.id.pass_image);
        email=findViewById(R.id.adminEmailLogin);
        password=findViewById(R.id.adminPasswordLogin);

        final boolean[] isPasswordVisible = {false};

        pass_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPasswordVisible[0] = !isPasswordVisible[0];

                if (isPasswordVisible[0]) {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    pass_img.setImageResource(R.drawable.open_eye);
                } else {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    pass_img.setImageResource(R.drawable.close_eye);
                }

                // Move cursor to the end of the text
                password.setSelection(password.getText().length());
            }
        });

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent=new Intent(registration.this,login.class);
                startActivity(loginIntent);
            }
        });



    }
}