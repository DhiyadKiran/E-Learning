package com.example.e_learning.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import com.example.e_learning.R;
import com.example.e_learning.databinding.FragmentVideoBinding;


public class VideoFragment extends Fragment {


    public VideoFragment() {
        // Required empty public constructor
    }

    private FragmentVideoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding  = FragmentVideoBinding.inflate(getLayoutInflater());


//        binding.videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.video);

        binding.videoView.setVideoPath("android.resource://"+ getActivity().getPackageName()+"/"+R.raw.video);

        MediaController mediaController = new MediaController(requireActivity());
        mediaController.setAnchorView(binding.videoView);
        binding.videoView.setMediaController(mediaController);

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