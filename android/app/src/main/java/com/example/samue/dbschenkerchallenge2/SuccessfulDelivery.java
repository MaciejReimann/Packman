package com.example.samue.dbschenkerchallenge2;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by michael on 09.12.18.
 */

public class SuccessfulDelivery extends AsyncTask<Void, Void, Void> {

    String json;
    String response = "";

    public SuccessfulDelivery(String id){
        this.json = "{\"id\":"+id+"}";
    }

    @Override
    protected Void doInBackground(Void... voids) {


        URL url = null;
        try {
            url = new URL("http://77.55.234.86:8090/api/parcel/delivered");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection client = null;
            try {
                client = (HttpURLConnection) url.openConnection();
                client.setRequestMethod("POST");

                client.setRequestProperty("Content-Type","application/json");

                client.setDoInput(true);
                client.setDoOutput(true);

                OutputStream os = client.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(json);

                writer.flush();
                writer.close();
                os.close();
                int responseCode = client.getResponseCode();

                if (responseCode == HttpsURLConnection.HTTP_OK) {
                    String line;
                    BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    while ((line = br.readLine()) != null) {
                        response += line;
                    }
                }
                else {
                    response = "!NOT_OKAY: "+responseCode;
                }
                Log.i("S_DELIV >> ", json);
                Log.i("S_DELIV >> ", responseCode+"");
            }
             catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(client != null) // Make sure the connection is not null.
                    client.disconnect();
            }


        return null;
    }


}
