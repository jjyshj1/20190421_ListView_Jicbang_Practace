package com.example.a2019042_listview_jicbang_practace.datas;

import java.io.Serializable;

public class Room implements Serializable {

    public int deposit;
    public int monthpay;
    public int floor;
    public String address;
    public String spec;
    public String description;
    public int managementCost;


    public Room(int deposit, int monthpay, int floor, String address, String spec, String description,int managementCost) {
        this.deposit = deposit;
        this.monthpay = monthpay;
        this.floor = floor;
        this.address = address;
        this.spec = spec;
        this.description = description;
        this.managementCost = managementCost;
    }
}
