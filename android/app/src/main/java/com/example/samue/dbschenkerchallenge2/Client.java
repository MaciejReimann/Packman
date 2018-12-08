package com.example.samue.dbschenkerchallenge2;

import java.util.ArrayList;

/**
 * Created by michael on 08.12.18.
 */

public class Client {

    public static int count = 0;

    public String id;
    public String name;
    public String description;
    public String phone_number;
    public String address;
    public String from;
    public String to;

    public boolean isSelected;
    public Parcel parcel;

    public Client(String id, String name, String address, String phone_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;

        this.isSelected = false;
        count++;
    }

    public Client(String id, String name, String description, String phone_number,
                  String from, String to, Parcel parcel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.phone_number = phone_number;
        this.address = "!address";
        this.from = from;
        this.to = to;
        this.parcel  = parcel;

        this.isSelected = false;
        count ++;
    }


}
