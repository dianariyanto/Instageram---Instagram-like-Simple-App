package com.example.edityomurti.instageram;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by edityomurti on 19/04/18.
 */

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder>{

    private List<Post> postData;
    private Context context;

    public FeedAdapter(List<Post> postData, Context context) {
        this.postData = postData;
        this.context = context;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed, parent, false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {
        int avatar = postData.get(position).getAvatar();
        String username = postData.get(position).getUsername();
        int image = postData.get(position).getImage();
        int likes = postData.get(position).getLikes();
        String desc = postData.get(position).getDesc();

        holder.ivAvatar.setImageDrawable(ContextCompat.getDrawable(context, avatar));
        holder.tvUsername.setText(username);
        holder.ivImage.setImageDrawable(ContextCompat.getDrawable(context, image));
        holder.tvLikes.setText(likes + " likes");
        holder.tvDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        return postData == null ? 0 : postData.size();
    }

    public class FeedViewHolder extends RecyclerView.ViewHolder{

        ImageView ivAvatar, ivImage;
        TextView tvUsername, tvLikes, tvDesc;

        public FeedViewHolder(View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.iv_avatar);
            ivImage = itemView.findViewById(R.id.iv_image);
            tvUsername = itemView.findViewById(R.id.tv_name);
            tvLikes = itemView.findViewById(R.id.tv_likes);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }
}
