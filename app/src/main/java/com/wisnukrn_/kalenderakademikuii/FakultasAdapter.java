package com.wisnukrn_.kalenderakademikuii;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by private on 21/12/2016.
 */

public class FakultasAdapter extends RecyclerView.Adapter<FakultasAdapter.MyViewHolder> {
    private Context mContext;
    private List<Fakultas> fakultasList;

    public FakultasAdapter(Context mContext, List<Fakultas> fakultasList) {
        this.mContext = mContext;
        this.fakultasList = fakultasList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_faculty, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Fakultas fakultas = fakultasList.get(position);
        holder.name.setText(fakultas.getName());
        Glide.with(mContext).load(fakultas.getImage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return fakultasList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.card_name);
            image = (ImageView) view.findViewById(R.id.card_image);

            Button buttonLihatKalender = (Button) view.findViewById(R.id.button_lihat_kalender);
            buttonLihatKalender.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, CalendarActivity.class);
                    intent.putExtra(CalendarActivity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }


    }
}
