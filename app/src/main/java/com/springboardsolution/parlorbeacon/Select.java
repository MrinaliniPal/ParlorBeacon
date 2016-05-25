package com.springboardsolution.parlorbeacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select extends AppCompatActivity {

    Button shop,cust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        shop = (Button)findViewById(R.id.shopkeeper);
        cust = (Button)findViewById(R.id.customer);
    }

    public void loginShop(View view)
    {
        Intent intent = new Intent(Select.this, Shopkeeper.class);
        startActivity(intent);
    }

    public void loginCust(View view)
    {
        Intent intent = new Intent(Select.this, Customer.class);
        startActivity(intent);
    }
}
