package com.example.lat2_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView TxHasil;
    EditText eduser, edpass;
    Button btlogin;

    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TxHasil = (TextView) findViewById(R.id.TxHasil);
        eduser = (EditText) findViewById(R.id.eduser);
        edpass = (EditText) findViewById(R.id.edpass);
        btlogin = (Button) findViewById(R.id.btlogin);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = eduser.getText().toString();
                pass = edpass.getText().toString();
                //if (eduser.getText().toString().length() == 0) {
                    //eduser.setError("Username harus diisi!");
                //}else if (edpass.getText().toString().length() == 0) {
                        //edpass.setError("Password harus diisi!");
                   //} else {
                            //jika form sudah terisi semua
                            //Toast.makeText(getApplicationContext(),
                                   // "Registrasi Sukses Lur!",
                                   // Toast.LENGTH_SHORT).show();
                    //TxHasil.setText(user + "" + pass);
                   // }
                    Bundle b = new Bundle(); //Siapkan Kardus
                    b.putString("u",user); // nyimpen barang ke kardus
                    b.putString("p",pass); // nyimpen barang ke kardus

                Intent in = new Intent(MainActivity.this, Activity2.class);
                in.putExtras(b); //memberi kardus ke kurir
                startActivity(in);

                }
        });
    }

    @Override
    public void onBackPressed() {

}
