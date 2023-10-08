package com.example.pokemonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapt extends RecyclerView.Adapter<Adapt.MyViewholder> {


    private List<Model> pkms;

    public ItemClickListener clickListener;
    public void setClickListener(ItemClickListener cl)
    {
        this.clickListener = cl;

    }

    public Adapt(List<Model> pkms) {
        this.pkms = pkms;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout
               , parent , false);

        return new MyViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
         Model m = pkms.get(position);


         holder.t.setText(m.getT1());
         holder.d.setText(m.getT2());
        holder.img.setImageResource(m.getIm());
    }

    @Override
    public int getItemCount() {
        return pkms.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        TextView t;
        TextView d;
        ImageView img;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            t = itemView.findViewById(R.id.textView);
            d = itemView.findViewById(R.id.textView2);
            img = itemView.findViewById(R.id.imageView);
            img.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
          if( clickListener!= null )
              clickListener.onCLick(view,getAdapterPosition());
        }
    }
}
