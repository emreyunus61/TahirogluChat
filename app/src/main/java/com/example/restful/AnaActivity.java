package com.example.restful;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class AnaActivity extends AppCompatActivity {

    private Toolbar actionbar;
    private ViewPager vpAna;
    private TabLayout tabsAna;
    private TabsAdapter tabsAdapter;

    private FirebaseAuth auth;
    private FirebaseUser currentUser;


    public void init(){


           actionbar = (Toolbar) findViewById(R.id.actionBar);
           setSupportActionBar(actionbar);
           getSupportActionBar().setTitle(R.string.app_name);

           auth =FirebaseAuth.getInstance();
           currentUser =auth.getCurrentUser();

           vpAna = (ViewPager) findViewById(R.id.vpAna);
           tabsAdapter = new  TabsAdapter(getSupportFragmentManager());
           vpAna.setAdapter(tabsAdapter);



           tabsAna = (TabLayout) findViewById(R.id.tabsAna);
           tabsAna.setupWithViewPager(vpAna);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana);

        init();
    }

    @Override
    protected void onStart() {

        if (currentUser==null){

            Intent intent=new Intent(AnaActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       super.onOptionsItemSelected(item);

       if (item.getItemId()==R.id.mainLogout){

           auth.signOut();

           Intent LoginIntent = new Intent(AnaActivity.this,LoginActivity.class );
           startActivity(LoginIntent);
           finish();

       }


        return true;
    }
}
