package com.evidentid.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evidentid.BaseRecyclerAdapter;
import com.evidentid.R;
import com.evidentid.adapters.viewholders.ObservationViewHolder;
import com.evidentid.models.Observation;

/**
 * Created by patel on 7/14/2017.
 */

public class ObservationAdapter extends BaseRecyclerAdapter<Observation, ObservationViewHolder> {

    @Override
    public ObservationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_observation, parent,false);
        return new ObservationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ObservationViewHolder holder, int position) {
        holder.bind(getItem(position));
    }
}
