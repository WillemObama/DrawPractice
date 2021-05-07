package com.example.drawpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    int practiceLayoutRes = R.layout.practice_color;

    public static PageFragment newInstance(int practiceLayoutRes){
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("practiceLayoutRes",practiceLayoutRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if(args != null){
            practiceLayoutRes = args.getInt("practiceLayoutRes");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(practiceLayoutRes,container,false);
        return view;
    }
}
