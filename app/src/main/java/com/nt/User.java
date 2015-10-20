package com.nt;


import android.provider.ContactsContract;

public class User {

    String Nome, Sobrenome, Usuario, DataNascimento, Senha;
    int Idade;


    public User(String Nome, String Sobrenome, String Usuario, String DataNascimento, int Idade, String Senha){
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Usuario = Usuario;
        this.DataNascimento = DataNascimento;
        this.Idade = Idade;
        this.Senha = Senha;
    }

    public User(String Usuario, String Senha){
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.Nome = "";
        this.Sobrenome = "";
        this.DataNascimento = "";
        this.Idade = -1;
    }


}
