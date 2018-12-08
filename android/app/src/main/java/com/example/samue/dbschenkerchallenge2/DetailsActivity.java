package com.example.samue.dbschenkerchallenge2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity  extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String newString = "!EMPTY";
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= "!NULL";
            } else {
                newString= extras.getString("CLIENT_DETAILS");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("CLIENT_DETAILS");
        }

        //ImageView of the backarrow to leave popup details
        ImageView profileMenu = (ImageView) findViewById(R.id.backArrow);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ((TextView)findViewById(R.id.client_details)).setText(newString);

    }

    }
