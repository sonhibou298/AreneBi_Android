package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtLogin, txtpwd;
    private Button btnConn;
    private String login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin = (EditText) findViewById(R.id.txtlogin);
        txtpwd = (EditText) findViewById(R.id.txtpwd);
        btnConn = (Button) findViewById(R.id.btnConn);
        btnConn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login = txtLogin.getText().toString().trim();
                password = txtpwd.getText().toString().trim();
                if(login.isEmpty() || password.isEmpty()){
                    String message = getString(R.string.erreur);
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}