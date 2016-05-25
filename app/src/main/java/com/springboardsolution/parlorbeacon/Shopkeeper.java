package com.springboardsolution.parlorbeacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shopkeeper extends AppCompatActivity {

    Button login;
    TextView signUp,forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopkeeper);

        login = (Button)findViewById(R.id.login);

        signUp = (TextView) findViewById(R.id.signUp);
        forgot = (TextView) findViewById(R.id.forgot);
    }

    public void LoginShop(View view)
    {
        Intent intent = new Intent(Shopkeeper.this, LoginShop.class);
        startActivity(intent);
    }

    public void SignUpShop(View view)
    {
        Intent intent = new Intent(Shopkeeper.this, SignUpShop.class);
        startActivity(intent);
    }

    public void Forgot(View view)
    {
        Intent intent = new Intent(Shopkeeper.this, Forgot.class);
        startActivity(intent);
    }
}
