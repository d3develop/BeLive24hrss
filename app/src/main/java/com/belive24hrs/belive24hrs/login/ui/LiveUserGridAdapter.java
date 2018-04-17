package com.belive24hrs.belive24hrs.login.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.belive24hrs.belive24hrs.R;

import java.util.ArrayList;

/**
 * Created by sujeet on 14/4/18.
 */

public class LiveUserGridAdapter extends RecyclerView.Adapter<LiveUserGridAdapter.MyViewHolder>{

    ArrayList personNames;
    ArrayList personImages;
    Context context;
    public LiveUserGridAdapter(Context context, ArrayList personNames, ArrayList personImages) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_item_live_user, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(personNames.get(position).toString());
        holder.image.setImageResource((Integer) personImages.get(position));
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // open another activity on item click
//                Intent intent = new Intent(context, SecondActivity.class);
//                intent.putExtra("image", personImages.get(position)); // put image data in Intent
//                context.startActivity(intent); // start Intent
            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
