package com.example.wallpaper;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaper.pojo.com.example.Hit;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.MyViewHolder> {

    Context context;
    List<Hit> hitList;

    public WallpaperAdapter(Context context, List<Hit> hitList) {
        this.context = context;
        this.hitList = hitList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Hit hit = hitList.get(position);
     //   holder.textView.setText(hit.getTags());
        Picasso.with(context).load(hit.getLargeImageURL()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return hitList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
       // TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           imageView = itemView.findViewById(R.id.image);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                imageView.setClipToOutline(true);
            }
         //  textView = itemView.findViewById(R.id.text);
        }
    }
}
