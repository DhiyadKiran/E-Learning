package com.example.e_learning.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learning.Adapter.HomeClassRecyclerAdapter;
import com.example.e_learning.Model.HomeClass;
import com.example.e_learning.R;
import com.example.e_learning.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private FragmentHomeBinding binding;
    private ArrayList<HomeClass> homeClasses;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());


        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new SelectLevelFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnMyCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new MyClassFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnBookClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new BookClassFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        homeClasses = new ArrayList<>();
        homeClasses.add(new HomeClass(R.drawable.elclass1,"Agriculture","Agriculture Of Plant","7h 20m"));
        homeClasses.add(new HomeClass(R.drawable.elclass2,"Agriculture","Agriculture Of Plant-2","5h"));
        homeClasses.add(new HomeClass(R.drawable.elclass3,"Maths","Graph And Element","3h 30m"));
        homeClasses.add(new HomeClass(R.drawable.elclass4,"Physics","Basic Physics ","8h"));
        homeClasses.add(new HomeClass(R.drawable.elclass5,"Computer","Android Development","10h 40m"));
        homeClasses.add(new HomeClass(R.drawable.elclass6,"Maths","Basic Maths","11h 20m"));
        homeClasses.add(new HomeClass(R.drawable.elclass8,"Finance","Basic Finance","6h"));
        homeClasses.add(new HomeClass(R.drawable.elclass9,"Engineering ","Basic Civil Engineering","10 50m"));
        homeClasses.add(new HomeClass(R.drawable.elclass10,"Engineering","Advance Civil Engineering","12 20m"));

        HomeClassRecyclerAdapter homeClassRecyclerAdapter =new HomeClassRecyclerAdapter(getContext(),homeClasses);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvHomeClass.setLayoutManager(gridLayoutManager);
        binding.rvHomeClass.setAdapter(homeClassRecyclerAdapter);


        return  binding.getRoot();
    }
}