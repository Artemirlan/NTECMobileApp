package ntecmobileapp.com.at.ntecmobileapp.accommodation;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import ntecmobileapp.com.at.ntecmobileapp.R;

public class AucklandMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auckland_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Button myLocat = (Button)findViewById(R.id.buttonGoogleMaps);
        myLocat.setOnClickListener(new View.OnClickListener() {            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=Ntec+Hobson,+Auckland+NewZealand&avoid=tf");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Add a marker in Sydney and move the camera


       // double latitude = -36.8453638;
       // double longitude = 174.7631425 ;

       // MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Here is NTEC Auckland Campus ");
       // googleMap.addMarker(marker);
       // mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(latitude, longitude)));
       // mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) );
        LatLng auckland = new LatLng(-36.8453638, 174.7631425);

        mMap.addMarker(new MarkerOptions().position(auckland).title("Marker in Auckland Campus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(auckland));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 9.0f ) );
    }
    public void myLocat(){

    }
}
