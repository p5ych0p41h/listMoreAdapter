package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DialogAdapter dialogAdapter = new DialogAdapter(this, createDialogs());

        ListView listView = findViewById(R.id.listViewDialog);
        listView.setAdapter(dialogAdapter);
    }

    Dialog[] createDialogs(){
        Dialog[] dialogs = new Dialog[5];
        String[] names = {"John","Elen","Stuart","Sam","Kurt"};
        String[] messages = {"hello","how are you","...","Hi","not good"};

        for(int i = 0; i < 5; i++){
            Dialog dialog = new Dialog();
            dialog.name = names[i];
            dialog.message = messages[i];
            dialogs[i] = dialog;
        }
        return dialogs;
    }
}