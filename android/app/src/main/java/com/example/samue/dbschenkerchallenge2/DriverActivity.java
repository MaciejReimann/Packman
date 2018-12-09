package com.example.samue.dbschenkerchallenge2;

import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class DriverActivity extends AppCompatActivity {

    private static final String TAG = "DriverActivity";
    SwipeController swipeController = null;

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
        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(clients, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                Log.i("position >>>  ", ""+position);
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                Client client = clients.get(position);
                String str = "" +
                        client.name + "  " + client.phone_number + "\n" +
                        client.parcel.address + "\n" +
                        "Expected Delivery:\n" +
                        "From:\t" + client.from + "\n" +
                        "To:  \t" + client.to + "\n" +
                        client.parcel.parcelNo;

                Log.i("client string >>> ", str);

                intent.putExtra("CLIENT_DETAILS", (Serializable) str);
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
