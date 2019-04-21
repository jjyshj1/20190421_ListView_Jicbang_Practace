package com.example.a2019042_listview_jicbang_practace;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a2019042_listview_jicbang_practace.adapter.RoomAdapter;
import com.example.a2019042_listview_jicbang_practace.databinding.ActivityMainBinding;
import com.example.a2019042_listview_jicbang_practace.datas.Room;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

RoomAdapter mroomAdapter;

    List<Room> roomList = new ArrayList<>();

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mroomAdapter = new RoomAdapter(MainActivity.this, roomList);

        act.roomListView.setAdapter(mroomAdapter);

        filldata();


    }

    void filldata(){
        roomList.add(new Room(100,13,7,"경북구미","원룸","풀옵션,초대박 원룸"));
        roomList.add(new Room(300,20,2,"부산","투룸","학교근처"));
        roomList.add(new Room(400,30,3,"대구","쓰리룸","역세권"));
        roomList.add(new Room(200,15,2,"서울","원룸","풀옵션,초대박 원룸"));
        roomList.add(new Room(150,17,1,"광주","쓰리룸","마트근처"));
        roomList.add(new Room(100,13,2,"진주","원룸","풀옵션,초대박 원룸"));

    }
}
