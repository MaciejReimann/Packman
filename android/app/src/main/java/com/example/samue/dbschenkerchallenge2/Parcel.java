package com.example.samue.dbschenkerchallenge2;

/**
 * Created by michael on 08.12.18.
 */

public class Parcel {

    public String id;
    public String parcelNo;
    public String address;
    public String deliveryTime;
    public String eta;
    public String status;

    public Parcel(String id, String parcelNo, String address, String deliveryTime, String eta, String status) {
        this.id = id;
        this.parcelNo = parcelNo;
        this.address = address;
        this.deliveryTime = deliveryTime;
        this.eta = eta;
        this.status = status;
    }
}
