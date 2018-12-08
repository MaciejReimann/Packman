package com.example.samue.dbschenkerchallenge2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by michael on 08.12.18.
 */

public class RecyclerViewAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView clientNameTextView;
        TextView clientAddresstextView;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
