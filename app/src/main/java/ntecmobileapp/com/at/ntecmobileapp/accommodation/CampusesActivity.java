package ntecmobileapp.com.at.ntecmobileapp.accommodation;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import ntecmobileapp.com.at.ntecmobileapp.LoginScreenActivity;
import ntecmobileapp.com.at.ntecmobileapp.Main2Activity;
import ntecmobileapp.com.at.ntecmobileapp.R;

public class CampusesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campuses);
        setTitle("NTEC Campuses");
        ImageButton auck = (ImageButton)findViewById(R.id.auckImgbtn);
        auck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CampusesActivity.this, AucklandCampus.class);
                startActivity(intent);
            }
        });
    }
}
