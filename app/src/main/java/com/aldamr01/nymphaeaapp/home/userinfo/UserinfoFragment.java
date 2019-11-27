package com.aldamr01.nymphaeaapp.home.userinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.aldamr01.nymphaeaapp.R;

public class UserinfoFragment extends Fragment {

    private UserinfoViewModel userinfoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        userinfoViewModel =
                ViewModelProviders.of(this).get(UserinfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_userinfo, container, false);
        final TextView textView = root.findViewById(R.id.text_userinfo);
        userinfoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}