package com.example.chauhan.retrofit;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class UsersAdapter extends ArrayAdapter {
    List<Result> list;
    int resource;
    LayoutInflater inflate;
Activity activity;
    public UsersAdapter(Activity activity, int resource, List<Result>list) {
        super(activity,resource, list);
       this.list = list;
        this.resource=resource;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
       inflate = LayoutInflater.from(activity);
        v = inflate.inflate(R.layout.customlist, null,false);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        TextView textView1 = (TextView) v.findViewById(R.id.textView2);
        TextView textView2 = (TextView) v.findViewById(R.id.textView3);
        Result result=list.get(position);
        textView.setText(result.getName());
        textView1.setText(result.getClass_());
        textView2.setText(result.getPhoneNo());
        return v;

    }

}




