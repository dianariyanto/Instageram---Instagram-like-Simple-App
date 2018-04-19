package com.example.edityomurti.instageram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.edityomurti.instageram.adapter.FeedAdapter;
import com.example.edityomurti.instageram.model.Post;

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

        rvMain = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        postData = new ArrayList<>();
        feedAdapter = new FeedAdapter(this, postData);

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
        post1.setLikes(230);
        post1.setDesc(getString(R.string.description));
        postData.add(post1);

        Post post2 = new Post();
        post2.setAvatar(R.drawable.ic_tia);
        post2.setUsername("techinasia");
        post2.setImage(R.drawable.sample_photo2);
        post2.setLikes(1230);
        post2.setDesc(getString(R.string.description2));
        postData.add(post2);

        Post post3 = new Post();
        post3.setAvatar(R.drawable.ic_startup);
        post3.setUsername("startupgrind");
        post3.setImage(R.drawable.sample_photo3);
        post3.setLikes(666);
        post3.setDesc(getString(R.string.description3));
        postData.add(post3);

        feedAdapter.notifyDataSetChanged();
    }
}
