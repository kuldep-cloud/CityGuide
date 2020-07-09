package com.example.cityguide.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cityguide.R;
import com.example.cityguide.User.UserDashboard;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIMER = 5000;

    ImageView backgroundImage;
    TextView poweredByLine;

    //Animation
    Animation sideAnim,bottomAnim;

   SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        backgroundImage=findViewById(R.id.backgroud_image);
        poweredByLine=findViewById(R.id.powered_by_line);

        //Animation
        sideAnim=AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        //set Animation on elements

        backgroundImage.setAnimation(sideAnim);
        poweredByLine.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                sharedPreferences=getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
                boolean isFirstTime=sharedPreferences.getBoolean("firstTime",true);


                if(isFirstTime)
                {
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                     startActivity(new Intent(getApplicationContext(), OnBoarding.class));
                      finish();
                    editor.putBoolean("firstTime",false);
                    editor.commit();

                }
                else
                {
                    startActivity(new Intent(getApplicationContext(), UserDashboard.class));
                    finish();

                }




            }
        },SPLASH_TIMER);






    }
}