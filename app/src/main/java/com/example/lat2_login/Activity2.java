package com.example.lat2_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {
    TextView txUser, txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txUser = (TextView) findViewById(R.id.txtUn );
        txPass = (TextView) findViewById(R.id.textView4);

        Intent in = getIntent(); // kurir dstang
        Bundle b = in.getExtras(); //kardus diterima
        //Bundle c = get.Intent().getExtras();

        String uname = b.getString("u"); // barang diambil
        String pass = b.getString("p");

        txUser.setText("nama" + uname); //barang dipakai
        txPass.setText("pass" + pass);
    }
}
