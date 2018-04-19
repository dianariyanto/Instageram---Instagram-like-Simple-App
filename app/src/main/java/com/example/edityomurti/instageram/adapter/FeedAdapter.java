package com.example.edityomurti.instageram.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.edityomurti.instageram.R;
import com.example.edityomurti.instageram.model.Post;

import java.util.List;

/**
 * Created by edityomurti on 19/04/18.
 */

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder>{

    private Context context;
    private List<Post> postData;

    public FeedAdapter(Context context, List<Post> postData) {
        this.context = context;
        this.postData = postData;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed, parent, false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedAdapter.FeedViewHolder holder, int position) {
        int avatar = postData.get(position).getAvatar();
        String username = postData.get(position).getUsername();
        int image = postData.get(position).getImage();
        int likes = postData.get(position).getLikes();
        String desc = postData.get(position).getDesc();

        holder.ivAvatar.setImageDrawable(ContextCompat.getDrawable(context, avatar));
        holder.tvUsername.setText(username);
        holder.ivImage.setImageDrawable(ContextCompat.getDrawable(context, image));
        holder.tvlikes.setText(likes + " likes");
        holder.tvDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        return postData == null ? 0 : postData.size();
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivAvatar, ivImage;
        public TextView tvUsername, tvlikes, tvDesc;

        public FeedViewHolder(View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.iv_avatar);
            ivImage = itemView.findViewById(R.id.iv_image);
            tvUsername =  itemView.findViewById(R.id.tv_name);
            tvlikes =  itemView.findViewById(R.id.tv_likes);
            tvDesc =  itemView.findViewById(R.id.tv_desc);
        }
    }
}
