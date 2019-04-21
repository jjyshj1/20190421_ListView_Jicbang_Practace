package com.example.a2019042_listview_jicbang_practace.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a2019042_listview_jicbang_practace.R;
import com.example.a2019042_listview_jicbang_practace.datas.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list){
        super(context, R.layout.room_list_item,list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row==null){
            row = inf.inflate(R.layout.room_list_item,null);

        }

        Room roomdata = mList.get(position);
        TextView depositTxt = row.findViewById(R.id.depositTxt);
        TextView floorTxt = row.findViewById(R.id.floorTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);
        TextView specTxt = row.findViewById(R.id.specTxt);
        TextView descriptionTxt = row.findViewById(R.id.descriptionTxt);

        depositTxt.setText(String.format("%d / %d",roomdata.deposit,roomdata.monthpay));
        floorTxt.setText(String.format("%d층",roomdata.floor));
        addressTxt.setText(roomdata.address);
        specTxt.setText(roomdata.spec);
        descriptionTxt.setText(roomdata.description);

        return row;
    }
}
