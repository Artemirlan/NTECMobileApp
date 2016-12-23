package ntecmobileapp.com.at.ntecmobileapp.accommodation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import ntecmobileapp.com.at.ntecmobileapp.R;

public class AucklandFacilitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auckland_facilities);

        ImageButton atm = (ImageButton) findViewById(R.id.imageATM);
        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AucklandFacilitiesActivity.this, NearestATM.class);
                startActivity(i);
            }
        });

    }
}
