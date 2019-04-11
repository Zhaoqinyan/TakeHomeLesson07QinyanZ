package com.example.takehomelesson07_qinyanz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private List<Dj> djs;
    private DjAdapter djsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialData();

        RecyclerView recylerView = (RecyclerView) findViewById(R.id.recycler_view);
        recylerView.setHasFixedSize(true);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
        djsAdapter=new DjAdapter(djs, this);
        recylerView.setAdapter(new DjAdapter(djs, this));
        recylerView.setAdapter(djsAdapter);
    }

    private void initialData() {
        djs = new ArrayList<>();
        djs.add(new Dj("Marshmello", R.drawable.marshmello));
        djs.add(new Dj("Zedd", R.drawable.zedd));
        djs.add(new Dj("deadmau5", R.drawable.deadmau5));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                djs.add(getRandomDj());
                djsAdapter.notifyDataSetChanged();

            default:
                return super.onOptionsItemSelected(item);

            case R.id.share:
                Toast.makeText(this, "Your file is shared",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,Second.class);
                startActivity(intent);
                return true;
            case R.id.save:
                Toast.makeText(this, "Your file is saved",Toast.LENGTH_SHORT).show();
                return true;
        }
    }

    private Dj getRandomDj(){
        int num =(int)(Math.random()*2);
        if (num==0)
            return new Dj("Marshmello", R.drawable.marshmello);
        else if (num==1)
            return new Dj("Zedd", R.drawable.zedd);
        else
            return new Dj ("deadmau5", R.drawable.deadmau5);
    }


}
