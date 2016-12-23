package ntecmobileapp.com.at.ntecmobileapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import ntecmobileapp.com.at.ntecmobileapp.accommodation.CampusesActivity;
import ntecmobileapp.com.at.ntecmobileapp.airportpickup.ChatActivity;
import ntecmobileapp.com.at.ntecmobileapp.aspire2info.AboutSegment;
import ntecmobileapp.com.at.ntecmobileapp.aspire2info.AspireActivity;
import ntecmobileapp.com.at.ntecmobileapp.aspire2info.BlankFragment;
import ntecmobileapp.com.at.ntecmobileapp.calendar.CalendarActivity;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //Programs start here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Creates toolbar for navigation drawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // FLoating button on the bottom of the screen, does not carry any function yet
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //Drawer initiallization
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Adding button to toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




//        listView = (ListView)findViewById(R.id.listView);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, Menuitems);
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
//                /* Send data to another activity */
//                if(position==0){
//                    Intent intent = new Intent(Main2Activity.this, ChatActivity.class);
//                    startActivity(intent);
//                } else if (position==1){
//                    Intent intent = new Intent(Main2Activity.this, CampusesActivity.class);
//                    startActivity(intent);
//                } else {
//                    Snackbar.make(view, "Under contruction", Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//                }
//            }
//        });

        // Each button of menu has an onclick listener and transit to another activity
        // all names are corresponded to each entry of menu
        ImageButton cal = (ImageButton)findViewById(R.id.imageButtonCalend);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                    startActivity(intent);
            }
        });
        ImageButton asp = (ImageButton)findViewById(R.id.imageButtonAsp);
        asp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, AspireActivity.class);
                startActivity(intent1);
            }
        });
        ImageButton cv = (ImageButton)findViewById(R.id.imageButtonCV);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, CVWriterActivity.class);
                startActivity(intent1);
            }
        });
        ImageButton virtual = (ImageButton)findViewById(R.id.imageButtonVTour);
        virtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, VirtualTourActivity.class);
                startActivity(intent1);
            }
        });
        ImageButton aboout = (ImageButton)findViewById(R.id.imageButton5);
        aboout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this, AboutActivity.class);
                startActivity(intent1);
            }
        });
    }
    //
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //Action overflow menu - not functional
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent1 = new Intent(Main2Activity.this, ChatActivity.class);
            startActivity(intent1);
        } else if (id == R.id.nav_gallery) {
            Intent intent1 = new Intent(Main2Activity.this, CampusesActivity.class);
            startActivity(intent1);

        } else if (id == R.id.nav_camera) {
            Intent intent1 = new Intent(Main2Activity.this, ChatActivity.class);
            startActivity(intent1);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
