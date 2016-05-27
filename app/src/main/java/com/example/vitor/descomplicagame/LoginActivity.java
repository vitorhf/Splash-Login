package com.example.vitor.descomplicagame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Vitor on 27/05/2016.
 */
public class LoginActivity extends AppCompatActivity{

    public ImageButton btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnFacebook = (ImageButton) findViewById(R.id.facebook);
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,PrincipalActivity.class);
                startActivity(i);

            }
        });


    }
}
