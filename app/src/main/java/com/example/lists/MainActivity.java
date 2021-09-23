package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final List<String> items = Arrays.asList("сало", "картопля", "цибуля", "буряк", "огірок", "сало", "картопля", "цибуля", "буряк", "огірок", "сало", "картопля", "цибуля", "буряк", "огірок", "сало", "картопля", "цибуля", "буряк", "огірок");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnLoadItems);
        ListView listView = findViewById(R.id.lvItems);
        RecyclerView recyclerView = findViewById(R.id.rvItems);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, items);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listView.getAdapter() == null)
                    listView.setAdapter(arrayAdapter);
                if(recyclerView.getAdapter() == null)
                    recyclerView.setAdapter(recyclerAdapter);

                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}