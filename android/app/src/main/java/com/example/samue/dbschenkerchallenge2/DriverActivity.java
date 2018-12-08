package com.example.samue.dbschenkerchallenge2;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DriverActivity extends AppCompatActivity {

    private static final String TAG = "DriverActivity";
    SwipeController swipeController = null;

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
        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(clients, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                startActivity(intent);
            }
        });

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
        itemTouchhelper.attachToRecyclerView(recyclerView);

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                swipeController.onDraw(c);
            }
        });
    }
}
