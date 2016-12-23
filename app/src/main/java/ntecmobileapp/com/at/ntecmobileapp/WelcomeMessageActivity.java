package ntecmobileapp.com.at.ntecmobileapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

public class WelcomeMessageActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        addSlide(SampleSlideFragment.newInstance(R.layout.intro2));
        setFadeAnimation();
        addSlide(SampleSlideFragment.newInstance(R.layout.intro1));
        setFadeAnimation();


    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        finish();
        loadMainActivity();

    }

    public void getStarted(View v){
        loadMainActivity();
    }
}

