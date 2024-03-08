package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText email,password;
    TextView signInBtn;
    ProgressDialog progressDialog;
    ImageView pass_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.adminEmailLogin);
        password=findViewById(R.id.adminPasswordLogin);

        progressDialog=new ProgressDialog(this);

        progressDialog.setTitle("Please Wait...");
        progressDialog.setCancelable(false);

        pass_img = findViewById(R.id.pass_image);



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
            public void onClick(View view) {
                progressDialog.show();
                if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty())

                {
                    progressDialog.dismiss();
                    Toast.makeText(login.this, "Please fill all details", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    String name="raja.gosai@ektayuwaclub.com";
                    String pass="raja@gosai1228";

                    if(email.getText().toString().equals(name) && password.getText().toString().equals(pass))
                    {
                        progressDialog.dismiss();
                        Intent intent=new Intent(login.this,Admin_main_page.class);
                        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);

                    }
                    else {
                        progressDialog.dismiss();
                        Toast.makeText(login.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
}