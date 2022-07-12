package br.com.piplay;



import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EventoActivity extends AppCompatActivity {

    ImageView expandDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evento_activity);

        expandDetails = (ImageView) findViewById(R.id.expandir);
        expandDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expandActivity();
            }
        });

        // Bottom Nav e Configuração dos links
        BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNav);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.BottomNav);
        bottomNavigationView.setSelectedItemId(R.id.page_events);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.page_home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.page_events:
                        return true;
                    case R.id.page_sales:
                        startActivity(new Intent(getApplicationContext(), OfertaActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
    private void expandActivity(){
        Intent expandActivityIntent = new Intent(this, EventoExpandActivity.class);
        startActivity(expandActivityIntent);
    }

}