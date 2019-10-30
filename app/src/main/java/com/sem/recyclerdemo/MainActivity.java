package com.sem.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements MyAdapter.ItemClickListener{

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<String> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.myrceyclerview);
        mRecyclerView.setHasFixedSize(true);
        myDataset = new ArrayList<>();
        myDataset.add("ACHREF");
        myDataset.add("NASSIMA");
        myDataset.add("ALEDDINE");
        myDataset.add("KHAIREDDINE");
        myDataset.add("AHLEM");

        myDataset.add("OUSSEMA");
        myDataset.add("MOHAMED");
        myDataset.add("ZIED");
        myDataset.add("HAYTHEM");
        myDataset.add("HATEM");

        myDataset.add("MANEL");
        myDataset.add("NEJIB");
        myDataset.add("SAMER");
        myDataset.add("DHIA");
        myDataset.add("MARYEM");



        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(this,myDataset);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + myDataset.get(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
