package com.example.subramanyam.googlejokes;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.migration.endpoints.backend.gjokes12.Gjokes12;
import com.example.subramanyam.gjokes.JActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 *
 */
 class JokeFetching extends AsyncTask<Context,Void,String> {
private static Gjokes12  myapiService=null;
    @SuppressLint("StaticFieldLeak")
    private Context mContext;
    //gets the current joke for testing
    public static String mJoke;



    @Override
    protected final String doInBackground(Context... params) {
      if(myapiService == null)
        {

            Gjokes12.Builder builder=new Gjokes12.Builder(AndroidHttp.newCompatibleTransport(),new AndroidJsonFactory(),
                    null).setRootUrl("https://gjokes12.appspot.com/_ah/api/").setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                @Override
                public void initialize(AbstractGoogleClientRequest<?> request) {
                    request.setDisableGZipContent(true);

                }
            });

           myapiService=builder.build();
        }

        mContext=params[0];

        try {
            return myapiService.getRandomJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mJoke=s;
        Intent jokeIntent=new Intent(mContext,JActivity.class);
        jokeIntent.putExtra(JActivity.JOKE_KEY,s);
        mContext.startActivity(jokeIntent);
    }
}
