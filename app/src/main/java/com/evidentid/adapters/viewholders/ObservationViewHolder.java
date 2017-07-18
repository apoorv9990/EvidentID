package com.evidentid.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.evidentid.R;
import com.evidentid.models.History;
import com.evidentid.models.Observation;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by patel on 7/14/2017.
 */

public class ObservationViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_date)
    TextView dateTextView;

    @BindView(R.id.text_min_temp)
    TextView minTemperatureTextView;

    @BindView(R.id.text_max_temp)
    TextView maxTemperatureTextView;

    public ObservationViewHolder(View view) {
        super(view);
        ButterKnife.bind(this,view);
    }

    public void bind(Observation observation) {
        dateTextView.setText(observation.getDate().getPretty());
        minTemperatureTextView.setText("Min Temp: " + observation.getMinTemp());
        maxTemperatureTextView.setText("Max Temp: " + observation.getMaxTemp());
    }
}
