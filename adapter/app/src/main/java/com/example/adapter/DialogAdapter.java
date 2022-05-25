package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DialogAdapter extends ArrayAdapter<Dialog> {
    public DialogAdapter(Context context, Dialog[] dialogs) {
        super(context, R.layout.dialog, dialogs);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        final Dialog dialog = getItem(position);
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.dialog, null);
        }
        ((TextView)view.findViewById(R.id.textViewName)).setText(dialog.name);
        ((TextView)view.findViewById(R.id.textViewMessage)).setText(dialog.message);
        return view;
    }
}
