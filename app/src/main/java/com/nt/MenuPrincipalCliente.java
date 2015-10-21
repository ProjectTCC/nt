package com.nt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MenuPrincipalCliente extends AppCompatActivity {
    public void abrirAjuda(View view) {

        Intent halp = new Intent(this, com.nt.Ajuda.class);
        startActivity(halp);
    }
    public void abrirDieta(View view) {

        Intent diet = new Intent(this, com.nt.Dietas.class);
        startActivity(diet);
    }
    public void abrirLista(View view) {

        Intent lista = new Intent(this, com.nt.lista.class);
        startActivity(lista);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
