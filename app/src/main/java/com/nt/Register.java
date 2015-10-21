package com.nt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName, etSobrenome, etAge, etUsername, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        etName = (EditText) findViewById(R.id.Nome);
        etSobrenome = (EditText) findViewById(R.id.Sobrenome);
        etAge = (EditText) findViewById(R.id.Idade);
        etUsername = (EditText) findViewById(R.id.Usuario);
        etPassword = (EditText) findViewById(R.id.Senha);

        bRegister = (Button) findViewById(R.id.bCadastro);
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bCadastro:

                String Nome = etName.getText().toString();
                String Usuario = etUsername.getText().toString();
                String Senha = etPassword.getText().toString();
                String Sobrenome = etSobrenome.getText().toString();
                int Idade = Integer.parseInt(etAge.getText().toString());

                User user = new User(Nome, Sobrenome, Usuario, null, Idade, Senha);


                break;
        }
    }






}
