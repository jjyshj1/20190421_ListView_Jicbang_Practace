package com.example.a2019042_listview_jicbang_practace;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

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

        act.roomListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Room clickedroomData = roomList.get(position);
                Intent intent = new Intent(MainActivity.this, Roomdetail.class);

                intent.putExtra("룸정보",clickedroomData);

                startActivity(intent);

            }
        });

        act.roomListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                roomList.remove(position);
                mroomAdapter.notifyDataSetChanged();


                return true;
            }
        });

        act.roomAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomList.add(new Room(500,20,1,"서울","엘리베이터","올수리",20));
                mroomAdapter.notifyDataSetChanged();

                act.roomListView.smoothScrollToPosition(roomList.size()-1);
            }
        });


    }

    void filldata(){
        roomList.add(new Room(100,13,1,"경북구미","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(300,20,2,"부산","투룸","학교근처",6));
        roomList.add(new Room(400,30,3,"대구","쓰리룸","역세권",8));
        roomList.add(new Room(200,15,2,"서울","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(150,17,1,"광주","쓰리룸","마트근처",7));
        roomList.add(new Room(100,13,2,"진주","원룸","풀옵션,초대박 원룸",6));
        roomList.add(new Room(100,13,1,"경북구미","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(300,20,2,"부산","투룸","학교근처",6));
        roomList.add(new Room(400,30,3,"대구","쓰리룸","역세권",8));
        roomList.add(new Room(200,15,2,"서울","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(150,17,1,"광주","쓰리룸","마트근처",7));
        roomList.add(new Room(100,13,2,"진주","원룸","풀옵션,초대박 원룸",6));
        roomList.add(new Room(100,13,1,"경북구미","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(300,20,2,"부산","투룸","학교근처",6));
        roomList.add(new Room(400,30,3,"대구","쓰리룸","역세권",8));
        roomList.add(new Room(200,15,2,"서울","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(150,17,1,"광주","쓰리룸","마트근처",7));
        roomList.add(new Room(100,13,2,"진주","원룸","풀옵션,초대박 원룸",6));
        roomList.add(new Room(100,13,1,"경북구미","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(300,20,2,"부산","투룸","학교근처",6));
        roomList.add(new Room(400,30,3,"대구","쓰리룸","역세권",8));
        roomList.add(new Room(200,15,2,"서울","원룸","풀옵션,초대박 원룸",5));
        roomList.add(new Room(150,17,1,"광주","쓰리룸","마트근처",7));
        roomList.add(new Room(100,13,2,"진주","원룸","풀옵션,초대박 원룸",6));
    }
}
