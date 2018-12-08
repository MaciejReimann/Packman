package com.example.samue.dbschenkerchallenge2;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by michael on 08.12.18.
 */

public class Server extends AsyncTask<Void, Void, Void>{

    private String URL_ADDRESS = "http://77.55.234.86:8090/api/client";

    private String data;

    public Server(String url){
        URL_ADDRESS = url;
    }


    @Override
    protected Void doInBackground(Void... voids) {
        data = "";
        try {
            URL url = new URL(URL_ADDRESS);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            String line = "";

            while(true){
                line = bufferedReader.readLine();
                if(null == line)
                    break;
                else
                    data += line;
            }
            Log.i("JSON read >> ", data);
            Fetch();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private void Fetch() {

        JSONArray ja = null;
        try {
            ja = new JSONArray(data);

            for(int i=0; i<ja.length(); i++ ) {
                JSONObject object = (JSONObject) ja.get(i);
                JSONArray pa = object.getJSONArray("parcels");
                ArrayList<Parcel> parcels = new ArrayList<>();
                for(int j=0; j<pa.length(); j++) {
                    JSONObject pobject = (JSONObject) pa.get(j);
                    Parcel parcel = new Parcel(pobject.getString("id"),
                            pobject.getString("parcelNo"),
                            pobject.getString("address"),
                            pobject.getString("deliveryTime"),
                            pobject.getString("eta"),
                            pobject.getString("status")
                    );
                    parcels.add(parcel);
                }
                DriverActivity.clients.add(new Client(object.getString("id"),
                        object.getString("name"),
                        object.getString("description"),
                        object.getString("phone"),
                        object.getString("from"),
                        object.getString("to"),
                        parcels));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);


    }

}
