package com.example.vitor.descomplicagame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PrincipalActivity extends AppCompatActivity {

    ImageButton btnPerfil;
    ImageButton btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnPerfil = (ImageButton) findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrincipalActivity.this,PerfilActivity.class);
                startActivity(i);

            }
        });

        btnSair = (ImageButton) findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
