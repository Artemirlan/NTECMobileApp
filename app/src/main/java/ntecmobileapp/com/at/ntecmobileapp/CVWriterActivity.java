package ntecmobileapp.com.at.ntecmobileapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CVWriterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvwriter);
        setTitle("CV Writer Tool");


        Button bt = (Button)findViewById(R.id.buttonYes);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent (CVWriterActivity.this, JobTools.class);
                        startActivity(i);
                    }
                });
    }

}
