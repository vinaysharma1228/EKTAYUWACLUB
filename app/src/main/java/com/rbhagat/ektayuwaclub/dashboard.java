package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class dashboard extends AppCompatActivity {
    ImageView threeLine;
    private FloatingActionButton fab;
    private TextView loginTextView;
    private TextView registrationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        fab = findViewById(R.id.fab);
        loginTextView = findViewById(R.id.loginTextView);
        registrationTextView = findViewById(R.id.registrationTextView);


        threeLine=findViewById(R.id.threeLine);

        threeLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(dashboard.this,mainPage.class);
                startActivity(intent);


            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleTextViewVisibility();
                animateFabIcon();
            }


                private void animateFabIcon() {
                    Animation rotateAnimation = AnimationUtils.loadAnimation(dashboard.this, R.anim.rotate_anim);
                    fab.startAnimation(rotateAnimation);

                    // Change icon after animation completes
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {}

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            fab.setImageResource(loginTextView.getVisibility() == View.VISIBLE
                                    ? R.drawable.close
                                    : R.drawable.plus);

                            // Clear animation to avoid issues with repeated animations
                            fab.clearAnimation();
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {}
                    });
                }



            private void toggleTextViewVisibility() {
                int visibility = loginTextView.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE;
                loginTextView.setVisibility(visibility);
                registrationTextView.setVisibility(visibility);
            }
        });

        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click on the loginTextView, navigate to the login page
                Intent loginIntent = new Intent(dashboard.this, login.class);
                startActivity(loginIntent);
            }
        });

        registrationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(dashboard.this, registration.class);
                startActivity(registerIntent);
            }
        });



    }
}