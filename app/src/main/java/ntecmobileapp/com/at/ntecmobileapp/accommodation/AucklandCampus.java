package ntecmobileapp.com.at.ntecmobileapp.accommodation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ntecmobileapp.com.at.ntecmobileapp.R;

public class AucklandCampus extends AppCompatActivity {
    Button location, facilities, tipsadvice, importcont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auckland_campus);

        location = (Button)findViewById(R.id.camplocBtn);
        facilities = (Button)findViewById(R.id.facilBtn);
        tipsadvice = (Button)findViewById(R.id.tipsadvBtn);
        importcont = (Button)findViewById(R.id.contemailBtn);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(AucklandCampus.this, AucklandMapActivity.class);
                startActivity(i1);
            }
        });

        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(AucklandCampus.this, AucklandFacilitiesActivity.class);
                startActivity(i2);
            }
        });
        tipsadvice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(AucklandCampus.this, TipAdviceActivity.class);
                startActivity(i3);
            }
        });
        importcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(AucklandCampus.this, ImportantContantActivity.class);
                startActivity(i4);
            }
        });
    }
}
