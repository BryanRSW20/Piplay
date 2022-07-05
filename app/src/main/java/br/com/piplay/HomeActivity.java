package br.com.piplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;



public class HomeActivity extends Activity {

    private BottomNavigationView BottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        BottomNav = (BottomNavigationView) findViewById(R.id.BottomNav);
        BottomNav.setSelectedItemId(R.id.page_home);
        BottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.page_events:
                        startActivity(new Intent(getApplicationContext(),EventActivity.class ));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.page_sales:
                        startActivity(new Intent(getApplicationContext(), SaleActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

    }
}
