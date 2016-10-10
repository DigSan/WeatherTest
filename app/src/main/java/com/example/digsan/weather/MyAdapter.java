package com.example.digsan.weather;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.digsan.weather.Models.weather.Forecast;

import java.util.List;

/**
 * Created by digsan on 06.10.2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Forecast> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tempHigh;
        TextView tempLow;
        TextView text;
        TextView day;
        TextView date;
        public View cardView;
        public ViewHolder(View v) {
            super(v);
            cardView = v;
            tempLow = (TextView)itemView.findViewById(R.id.card_tempHigh);
            text = (TextView)itemView.findViewById(R.id.card_text);
            tempHigh = (TextView)itemView.findViewById(R.id.card_tempHigh);
            day = (TextView)itemView.findViewById(R.id.card_day);
            //date = (TextView)itemView.findViewById(R.id.card_date);
        }
    }
    public MyAdapter(List<Forecast> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_dayweather, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tempLow.setText(mDataset.get(position).getLow());
        holder.tempHigh.setText(mDataset.get(position).getHigh());
        holder.text.setText(mDataset.get(position).getText());
        holder.day.setText(mDataset.get(position).getDay());
        //holder.date.setText(mDataset.get(position).getDate());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
