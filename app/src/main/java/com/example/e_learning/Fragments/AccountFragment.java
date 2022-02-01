package com.example.e_learning.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learning.R;
import com.example.e_learning.databinding.FragmentAccountBinding;

public class AccountFragment extends Fragment {

    public AccountFragment() {
        // Required empty public constructor
    }

    private FragmentAccountBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          binding = FragmentAccountBinding.inflate(getLayoutInflater());


        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new HomeFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });


          return binding.getRoot();
    }
}