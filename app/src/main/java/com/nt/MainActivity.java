package com.nt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button bLogout;
    EditText etName, etSobrenome, etAge, etUsername, etPassword;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.Nome);
        etSobrenome = (EditText) findViewById(R.id.Sobrenome);
        etAge = (EditText) findViewById(R.id.Idade);
        etUsername = (EditText) findViewById(R.id.Usuario);
        etPassword = (EditText) findViewById(R.id.Senha);

        bLogout = (Button) findViewById(R.id.bSair);
        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);

    }


    @Override
    protected void onStart() {
        super.onStart();


        if(autheticate()){
            displayUserDetails();
        }else{
            startActivity(new Intent(MainActivity.this, Login.class));
        }
    }


    private void displayUserDetails(){
        User user = userLocalStore.getLoggedInUser();

        etUsername.setText(user.Usuario);
        etAge.setText(user.Idade + "");
        etSobrenome.setText(user.Sobrenome);
    }

    private boolean autheticate(){
        return userLocalStore.getUserLoggedIn();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bSair:

                userLocalStore.ClearUserData();
                userLocalStore.setUserLogged(false);



                startActivity(new Intent(this, Login.class));

                break;
        }
    }




}
