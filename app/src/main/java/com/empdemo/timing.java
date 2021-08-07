package com.empdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class timing extends Fragment {

    TimePicker timestart,timeend;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.timing,container,false);

        timestart = rootview.findViewById(R.id.timestart);
        timeend = rootview.findViewById(R.id.timeend);

        timestart.setIs24HourView(true);
        timeend.setIs24HourView(true);
        return rootview;
    }
}
