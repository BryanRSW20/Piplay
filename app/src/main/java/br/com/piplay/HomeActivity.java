package br.com.piplay;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class HomeActivity extends Activity {

    private BottomNavigationView BottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        BottomNav = (BottomNavigationView) findViewById(R.id.BottomNav);
    }
}
