package com.example.samue.dbschenkerchallenge2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by michael on 08.12.18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    ArrayList<Client> clients = new ArrayList<>();
    Context context;

    public RecyclerViewAdapter(ArrayList<Client> clients, Context context){
        this.clients = clients;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.i(">>> ", "onBindViewHolder : called");
        Log.d(">>> ", "onBindViewHolder : called");

        holder.clientNameTextView.setText(clients.get(position).name);
        holder.clientAddresstextView.setText(clients.get(position).address);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = position;
                onClientClick(v, i);
            }
        });

    }

    private void onClientClick(View v, int position) {
        Toast.makeText(context, clients.get(position).name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return clients.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView clientNameTextView;
        TextView clientAddresstextView;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            clientNameTextView = itemView.findViewById(R.id.clientNameTextView);
            clientAddresstextView = itemView.findViewById(R.id.clientAddressTextView);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }
}
