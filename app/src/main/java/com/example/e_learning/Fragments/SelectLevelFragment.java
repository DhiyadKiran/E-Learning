package com.example.e_learning.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learning.MainActivity;
import com.example.e_learning.R;
import com.example.e_learning.databinding.FragmentSelectLevelBinding;

public class SelectLevelFragment extends Fragment {


    public SelectLevelFragment() {
        // Required empty public constructor
    }

    private FragmentSelectLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSelectLevelBinding.inflate(getLayoutInflater());


        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frLoginContainer,new LoginFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
                requireActivity().finishAffinity();
            }
        });

//        binding.textView21.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                binding.textView21.setTextColor(getResources().getColor(R.color.white));
//                binding.textView21.setBackgroundColor(getResources().getColor(R.color.purple));
//            }
//        });

        return binding.getRoot();
    }
}