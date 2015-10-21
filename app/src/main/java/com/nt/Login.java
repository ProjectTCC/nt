package com.nt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView TVregisterLink;

    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.Usuario);
        etPassword = (EditText) findViewById(R.id.Senha);
        bLogin= (Button) findViewById(R.id.bLogin);
        TVregisterLink = (TextView) findViewById(R.id.tvRegister);

        bLogin.setOnClickListener(this);

        TVregisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:

                User user = new User(null, null);
                userLocalStore.StoreUserData(user);
                userLocalStore.setUserLogged(true);

                break;


            case R.id.tvRegister:

                startActivity(new Intent(this, Register.class));

                break;

        }
    }
}
