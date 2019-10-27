package com.example.myapplication;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycleadapter extends RecyclerView.Adapter<recycleadapter.recyclerholder>{
    ArrayList<String> myList;

    public recycleadapter(ArrayList list) {
        myList = list;
    }

    @NonNull
    @Override
    public recyclerholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        recyclerholder holder=new recyclerholder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final recyclerholder holder, int position1) {
       // holder.txtName.setText(myList.get(position));
        holder.img.setText(myList.get(position1));
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                if(holder.img.getText()=="Profile")
                {
                    intent = new Intent(v.getContext(),profileset.class);

                }else
                {
                    intent=new Intent(v.getContext(),phone.class);
                }
                v.getContext().startActivity(intent);
            }
        });


//      if (position==0)
//          holder.img.setBackgroundResource(R.drawable.profile);
//      else
//          holder.img.setBackgroundResource(R.drawable.call);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class recyclerholder extends RecyclerView.ViewHolder{
        TextView txtName;
        Button img;

        public recyclerholder(@NonNull View itemView) {
            super(itemView);
          //  txtName = itemView.findViewById(R.id.txtName);
            img=itemView.findViewById(R.id.img);

        }
    }
}
