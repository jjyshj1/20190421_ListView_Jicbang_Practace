package com.example.a2019042_listview_jicbang_practace;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a2019042_listview_jicbang_practace.databinding.ActivityRoomdetailBinding;
import com.example.a2019042_listview_jicbang_practace.datas.Room;

public class Roomdetail extends AppCompatActivity {

    Room mRoomData;
    ActivityRoomdetailBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this,R.layout.activity_roomdetail);

        mRoomData =(Room) getIntent().getSerializableExtra("룸정보");

        act.mdepositTxt.setText(String.format("월세 %d / %d",mRoomData.deposit,mRoomData.monthpay));
        act.mspecTxt.setText(mRoomData.spec);
        act.mdescriptionTxt.setText(mRoomData.description);

        switch (mRoomData.floor){
            case 1: act.mfloorBtn.setImageResource(R.drawable.floor_1);
            break;
            case 2: act.mfloorBtn.setImageResource(R.drawable.floor_2);
            break;
            case 3: act.mfloorBtn.setImageResource(R.drawable.floor_3);
            break;
        }

        act.mcallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri phonNum =Uri.parse("tel:"+"010-6666-7777");
                Intent intent = new Intent(Intent.ACTION_DIAL,phonNum);
                startActivity(intent);
            }
        });




    }
}
