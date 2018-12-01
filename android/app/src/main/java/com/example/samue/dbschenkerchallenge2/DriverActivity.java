package com.example.samue.dbschenkerchallenge2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DriverActivity extends AppCompatActivity {

    private static final String TAG = "DriverActivity";

    private ArrayList<Client> clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        clients = new ArrayList<Client>();

        initListOfClients();


    }

    private void initListOfClients() {
        clients.add(new Client("id1","Name Surname1","Warsaw", "+48 123 1" ));
        clients.add(new Client("id2","Name Surname3","Warsaw", "+48 123 2" ));
        clients.add(new Client("id3","Name Surname2","Warsaw", "+48 123 3" ));

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clients, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
