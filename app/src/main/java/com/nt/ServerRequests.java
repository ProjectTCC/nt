package com.nt;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;

import java.util.ArrayList;

public class ServerRequests {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 * 15 ;
    public static final String SERVERADRESS = " http://nutritime.comuf.com/";

    public ServerRequests(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Fazendo o role");
        progressDialog.setMessage("Espera ai o porra !");

    }

    public void StoreUserDataInBackground(User user, getUserCallBack userCallBack){
        progressDialog.show();
        new StoreUserDataAsyncTask(user, userCallBack).execute();
    }

    public void fetchUserDatainBackground(User user, getUserCallBack userCallBack){
        progressDialog.show();
    }





    public class StoreUserDataAsyncTask extends AsyncTask<Void, Void, Void> {
        User user;
        getUserCallBack userCallBack;


        public StoreUserDataAsyncTask(User user , getUserCallBack userCallBack){
            this.user = user;
            this.userCallBack = userCallBack;
        }


        @Override
        protected Void doInBackground(Void... params) {
            //ArrayList<NameValuePair> dataToSend = new ArrayList<>();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            progressDialog.dismiss();
            userCallBack.done(null);

            super.onPostExecute(aVoid);
        }
    }


}
