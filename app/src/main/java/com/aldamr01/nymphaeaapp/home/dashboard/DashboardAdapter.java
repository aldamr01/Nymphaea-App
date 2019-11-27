package com.aldamr01.nymphaeaapp.home.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.aldamr01.nymphaeaapp.R;

import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    private Context context;
    private List<DashboardModel> dataPond;
    private List<DashboardModel.Data> dataPondFiltered;
    private List<DashboardModel.Data.Fields> dataPondDetail;

    private TextView tv_pond_name, tv_pond_location, ideal_ph, ideal_tds, ideal_turbidity,
                     ideal_oxygen, ideal_temperature, current_ph, current_tds, current_turbidity,
                     current_oxygen, current_temperature;
    private CardView cardView;
    private DashboardAdapter dashboardAdapter;

    public DashboardAdapter(Context context, DashboardModel dataPond){
        this.context = context;
        this.dataPond = (List<DashboardModel>) dataPond;
    }

    @Override
    public DashboardAdapter.DashboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater dashboardInflater = LayoutInflater.from(context);
        view = dashboardInflater.inflate(R.layout.list_dashboard_pond, parent, false);

        final DashboardAdapter.DashboardViewHolder viewHolder = new DashboardViewHolder(view);
        viewHolder.cv_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardAdapter.DashboardViewHolder holder, int position) {
        holder.pond_name.setText(dataPondDetail.get(position).getName());
        holder.current_oxygen.setText((int) dataPondDetail.get(position).getCurrent_oxygen());
        holder.current_temperature.setText((int) dataPondDetail.get(position).getCurrent_temperature());
        holder.current_turbidity.setText((int) dataPondDetail.get(position).getCurrent_turbidity());
        holder.current_ph.setText((int) dataPondDetail.get(position).getCurrent_ph());
        holder.current_tds.setText((int) dataPondDetail.get(position).getCurrent_tds());
    }

    @Override
    public int getItemCount() {
        if(dataPond != null){
            return dataPond.size();
        }
        return 0;
    }

    public static class DashboardViewHolder extends RecyclerView.ViewHolder{
        private CardView cv_dashboard;
        private TextView pond_name, pond_location, ideal_ph, ideal_tds, ideal_turbidity, ideal_oxygen, ideal_temperature,
                         current_ph, current_tds, current_temperature, current_turbidity, current_oxygen;

        public DashboardViewHolder(View itemView) {
            super(itemView);
            pond_name = itemView.findViewById(R.id.tv_pond_name);
            pond_location = itemView.findViewById(R.id.tv_pond_location);
            ideal_ph = itemView.findViewById(R.id.ideal_ph);
            ideal_tds = itemView.findViewById(R.id.ideal_tds);
            ideal_temperature = itemView.findViewById(R.id.ideal_temperature);
            ideal_oxygen = itemView.findViewById(R.id.ideal_oxygen);
            ideal_turbidity = itemView.findViewById(R.id.ideal_turbidity);
            current_ph = itemView.findViewById(R.id.current_ph);
            current_tds = itemView.findViewById(R.id.current_tds);
            current_temperature = itemView.findViewById(R.id.current_temperature);
            current_oxygen = itemView.findViewById(R.id.current_oxygen);
            current_turbidity = itemView.findViewById(R.id.current_turbidity);
        }
    }
}
