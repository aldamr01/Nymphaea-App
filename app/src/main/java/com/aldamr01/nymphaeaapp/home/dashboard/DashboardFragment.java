package com.aldamr01.nymphaeaapp.home.dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.aldamr01.nymphaeaapp.R;
import com.aldamr01.nymphaeaapp.config.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recyclerView;
    private DashboardAdapter dashboardAdapter;

    private List<DashboardModel> dataset;
    private List<DashboardModel.Data> dataPond;
    private SwipeRefreshLayout dashboardSwipeRefreshLayout;

    @SuppressLint("ResourceAsColor")
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView = root.findViewById(R.id.rv_dashboard);

        dashboardSwipeRefreshLayout = root.findViewById(R.id.srl_dashboard);
        dashboardSwipeRefreshLayout.setOnRefreshListener(this);
        dashboardSwipeRefreshLayout.setColorSchemeColors(R.color.colorPrimary,
                android.R.color.holo_blue_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_green_dark);

        if(dashboardAdapter != null){
            dataset.clear();
            dashboardAdapter.notifyDataSetChanged();
            onPost();
        }else{
            onPost();
        }
        return root;
    }

    private void onPost(){
        dashboardSwipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                dashboardSwipeRefreshLayout.setRefreshing(true);
                initData();
            }
        });
    }

    private void initData(){
        dashboardSwipeRefreshLayout.setRefreshing(true);
        String header = "Token 7bc4500cb16e1ef87b0254afdfe664ef4e74c43b";
        String param = "7bc4500cb16e1ef87b0254afdfe664ef4e74c43b";
        Call<DashboardModel> call = RetrofitClient
                .getInstance()
                .getApi()
                .filteredPond(header, param);

        call.enqueue(new Callback<DashboardModel>() {
            @Override
            public void onResponse(Call<DashboardModel> call, Response<DashboardModel> response) {
                Log.d("response", response.body().getMessage().toString());
                try{
                    String status_code = response.body().getStatus_code().toString();
                    String message = response.body().getMessage().toString();
                    dataPond = response.body().getData();

                }catch(Exception e){
                    Log.d("error", "aa");
                }
                dashboardSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<DashboardModel> call, Throwable t) {
                Log.d("error","Koneksi bermasalah");
                dashboardSwipeRefreshLayout.setRefreshing(false);
            }
        });

    }

    @Override
    public void onRefresh() {
        if(dashboardAdapter != null){
            dataset.clear();
            dashboardAdapter.notifyDataSetChanged();
            initData();
        }else{
            initData();
        }
    }
}