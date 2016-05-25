package com.springboardsolution.parlorbeacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Customer extends AppCompatActivity {

    Button login;
    TextView signUp,forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        login = (Button)findViewById(R.id.login);

        signUp = (TextView) findViewById(R.id.signUp);
        forgot = (TextView) findViewById(R.id.forgot);
    }

    public void LoginCust(View view)
    {
        Intent intent = new Intent(Customer.this, LoginCust.class);
        startActivity(intent);
    }

    public void SignUpCust(View view)
    {
        Intent intent = new Intent(Customer.this, SignUpCust.class);
        startActivity(intent);
    }

    public void Forgot(View view)
    {
        Intent intent = new Intent(Customer.this, Forgot.class);
        startActivity(intent);
    }
}
