package com.nt;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.ContactsContract;


public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void StoreUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("Nome", user.Nome);
        spEditor.putString("Usuario", user.Usuario);
        spEditor.putInt("Idade", user.Idade);
        spEditor.putString("Senha", user.Senha);
        spEditor.putString("Data", user.DataNascimento);
        spEditor.commit();
    }


    public User getLoggedInUser(){
        String nome = userLocalDatabase.getString("Nome", "");
        String Sobrenome = userLocalDatabase.getString("Sobrenome", "");
        String Usuario = userLocalDatabase.getString("Usuario", "");
        String Senha = userLocalDatabase.getString("Nome", "");
        int idade = userLocalDatabase.getInt("Nome", -1);
        String DataDeNascimento = userLocalDatabase.getString("Data", "");

        User storedUser = new User(nome, Sobrenome, Usuario, DataDeNascimento, idade, Senha);
        return storedUser;
    }

    public void setUserLogged(boolean logged){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("LoggedIn", logged);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if(userLocalDatabase.getBoolean("LoggedIn", false) == true){
            return true;
        }else {
            return false;
        }
    }

    public void ClearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }


}
