package com.example.edityomurti.instageram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edityomurti on 19/04/18.
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    private LinearLayoutManager layoutManager;
    private List<Post> postData;
    private FeedAdapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = (RecyclerView) findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        postData = new ArrayList<>();
        feedAdapter = new FeedAdapter(postData, this);

        rvMain.setHasFixedSize(true);
        rvMain.setLayoutManager(layoutManager);
        rvMain.setAdapter(feedAdapter);

        getData();
    }

    private void getData(){
        Post post1 = new Post();
        post1.setAvatar(R.drawable.tc_logo);
        post1.setUsername("techcrunch");
        post1.setImage(R.drawable.sample_photo);
        post1.setLikes(5000);
        post1.setDesc(getString(R.string.description));

        postData.add(post1);

        Post post2 = new Post();
        post2.setAvatar(R.drawable.logo_ugm);
        post2.setUsername("ugm.yogyakarta");
        post2.setImage(R.drawable.ugm_gedung);
        post2.setLikes(666);
        post2.setDesc(getString(R.string.description));

        postData.add(post2);

        feedAdapter.notifyDataSetChanged();
    }

}
