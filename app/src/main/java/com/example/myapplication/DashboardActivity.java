package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView exit = findViewById(R.id.cardLOGOUT);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        CardView mancity = findViewById(R.id.cardManCity);
        mancity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MancityActivity.class));
            }
        });

        CardView liverpool = findViewById(R.id.cardLiverpool);
        liverpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LiverpoolActivity.class));
            }
        });

        CardView arsenal = findViewById(R.id.cardArsenal);
        arsenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ArsenalActivity.class));
            }
        });

        CardView Totenham = findViewById(R.id.cardTotenham);
        Totenham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, TotenharmActivity.class));
            }
        });

        CardView alv = findViewById(R.id.cardAvl);
        alv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AstonVillaActivity.class));
            }
        });

        CardView manu = findViewById(R.id.cardMUN);
        manu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ManchesterUnitedActivity.class));
            }
        });

        CardView newcastle = findViewById(R.id.cardNEW);
        newcastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, NewCasteActivity.class));
            }
        });

        CardView Bha = findViewById(R.id.cardBHA);
        Bha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, BhaActivity.class));
            }
        });

        CardView news = findViewById(R.id.cardnews);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, NewsActivity.class));
            }
        });

        CardView livescores = findViewById(R.id.cardlivescores);
        livescores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LiveScoresActivity.class));
            }
        });

        CardView Fixtures = findViewById(R.id.cardFIXTURES);
        Fixtures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FixturesActivity.class));
            }
        });

        CardView Table = findViewById(R.id.cardTABLE);
        Table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, TableActivity.class));
            }
        });

        CardView Transfers = findViewById(R.id.cardTRANSFERS);
        Transfers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, TransfersActivity.class));
            }
        });

        CardView highlights = findViewById(R.id.cardHIGHLIGHTS);
        highlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, HighlightsActivity.class));
            }
        });


    }
}