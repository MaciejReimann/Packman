package com.example.samue.dbschenkerchallenge2;

import java.util.ArrayList;

/**
 * Created by michael on 08.12.18.
 */

public class Client {

    public String id;
    public String name;
    public String description;
    public String phone_number;
    public String address;
    public String from;
    public String to;

    public ArrayList<Parcel> parcels;

    public Client(String id, String name, String address, String phone_number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public Client(String id, String name, String description, String phone_number,
                  String from, String to, ArrayList<Parcel> parcels) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.phone_number = phone_number;
        this.address = "!address";
        this.from = from;
        this.to = to;
        this.parcels  = new ArrayList<Parcel>(parcels);
    }
}
