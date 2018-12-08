package com.example.samue.dbschenkerchallenge2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class DriverActivity extends AppCompatActivity {

    private static final String TAG = "DriverActivity";

    public static ArrayList<Client> clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        clients = new ArrayList<Client>();

        initListOfClients();


    }

    private void initListOfClients() {

        /// Fet JSON
        Server server = new Server("http://77.55.234.86:8090/api/client");
        try {
            server.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /// Write JSON


        initRecyclerView();


    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clients, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
