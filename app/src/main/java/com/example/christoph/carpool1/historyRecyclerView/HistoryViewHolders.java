package com.example.christoph.carpool1.historyRecyclerView;

/**
 * Created by christoph on 11/19/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

//import com.example.christoph.carpool1.HistorySingleActivity;
import com.example.christoph.carpool1.HistorySingleActivity;
import com.example.christoph.carpool1.R;


public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView rideId;
    public TextView time;
    public TextView ridePrice;

    public HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        rideId = (TextView) itemView.findViewById(R.id.rideId);
        time = (TextView) itemView.findViewById(R.id.time);
        ridePrice=(TextView) itemView.findViewById(R.id.ridePrice);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), HistorySingleActivity.class);
        Bundle b = new Bundle();
        b.putString("rideId", rideId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);
    }
}