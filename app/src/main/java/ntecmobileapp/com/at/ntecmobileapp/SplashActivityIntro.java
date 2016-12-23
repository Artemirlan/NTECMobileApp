package ntecmobileapp.com.at.ntecmobileapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivityIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        int secondsDelayed = 3;
        //creating a handler which launches the splash activity and delays it for 3 seconds


        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(SplashActivityIntro.this, SplashScreenActivity.class);
                startActivity(i);
            }
        }, secondsDelayed * 1000);
    }
}
