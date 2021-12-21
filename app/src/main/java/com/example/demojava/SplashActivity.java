package com.example.demojava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnticipateInterpolator;

import java.time.Duration;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();

    }
    void init() {
        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashActivity.this, DetailsActivity.class);
            startActivity(i);
            finish();
        }, 2000);
    }
}
//       getSplashScreen().setOnExitAnimationListener(splashScreenView -> {
//            final ObjectAnimator slideUp = ObjectAnimator.ofFloat(
//                    splashScreenView,
//                    View.TRANSLATION_Y,
//                    0f,
//                    -splashScreenView.getHeight()
//            );
//            slideUp.setInterpolator(new AnticipateInterpolator());
//            slideUp.setDuration(200L);
//
//            // Call SplashScreenView.remove at the end of your custom animation.
//            slideUp.addListener(new AnimatorListenerAdapter() {
//                @RequiresApi(api = Build.VERSION_CODES.S)
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    splashScreenView.remove();
//                }
//            });
//
//            // Run your animation.
//            slideUp.start();
//        });

// final View content = findViewById(android.R.id.content);
//        content.getViewTreeObserver().addOnPreDrawListener(
//                new ViewTreeObserver.OnPreDrawListener() {
//                    @Override
//                    public boolean onPreDraw() {
//                        content.getViewTreeObserver().removeOnPreDrawListener(this);
//                        return true;
//                    }
//                }
//        );

