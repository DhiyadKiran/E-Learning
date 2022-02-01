package com.example.e_learning.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.e_learning.Adapter.BookClassRecyclerAdapter;
import com.example.e_learning.Adapter.HomeClassRecyclerAdapter;
import com.example.e_learning.Model.BookClass;
import com.example.e_learning.Model.HomeClass;
import com.example.e_learning.R;
import com.example.e_learning.databinding.FragmentBookClassBinding;

import java.util.ArrayList;

public class BookClassFragment extends Fragment {

    public BookClassFragment() {
        // Required empty public constructor
    }

    private FragmentBookClassBinding binding;
    private ArrayList<BookClass> bookClasses;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding =  FragmentBookClassBinding.inflate(getLayoutInflater());

       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireActivity(),R.array.Class, android.R.layout.simple_spinner_item);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       binding.spClass.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(requireActivity(),R.array.Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spType.setAdapter(adapter1);

        binding.igBackAero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer,new HomeFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        bookClasses = new ArrayList<>();
        bookClasses.add(new BookClass(R.drawable.elclass1,"Agriculture","Agriculture Of Plant","7h 20m"));
        bookClasses.add(new BookClass(R.drawable.elclass2,"Agriculture","Agriculture Of Plant-2","5h"));
        bookClasses.add(new BookClass(R.drawable.elclass3,"Maths","Graph And Element","3h 30m"));
        bookClasses.add(new BookClass(R.drawable.elclass4,"Physics","Basic Physics ","8h"));
        bookClasses.add(new BookClass(R.drawable.elclass5,"Computer","Android Development","10h 40m"));
        bookClasses.add(new BookClass(R.drawable.elclass6,"Maths","Basic Maths","11h 20m"));
        bookClasses.add(new BookClass(R.drawable.elclass8,"Finance","Basic Finance","6h"));
        bookClasses.add(new BookClass(R.drawable.elclass9,"Engineering ","Basic Civil Engineering","10 50m"));
        bookClasses.add(new BookClass(R.drawable.elclass10,"Engineering","Advance Civil Engineering","12 20m"));

        BookClassRecyclerAdapter bookClassRecyclerAdapter =new BookClassRecyclerAdapter(getContext(),bookClasses);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1, RecyclerView.HORIZONTAL,false);
        binding.rvPopularClasses.setLayoutManager(gridLayoutManager);
        binding.rvPopularClasses.setAdapter(bookClassRecyclerAdapter);

        bookClasses = new ArrayList<>();
        bookClasses.add(new BookClass(R.drawable.elclass10,"Engineering","Advance Civil Engineering","12 20m"));
        bookClasses.add(new BookClass(R.drawable.elclass9,"Engineering ","Basic Civil Engineering","10 50m"));
        bookClasses.add(new BookClass(R.drawable.elclass8,"Finance","Basic Finance","6h"));
        bookClasses.add(new BookClass(R.drawable.elclass6,"Maths","Basic Maths","11h 20m"));
        bookClasses.add(new BookClass(R.drawable.elclass5,"Computer","Android Development","10h 40m"));
        bookClasses.add(new BookClass(R.drawable.elclass4,"Physics","Basic Physics ","8h"));
        bookClasses.add(new BookClass(R.drawable.elclass3,"Maths","Graph And Element","3h 30m"));
        bookClasses.add(new BookClass(R.drawable.elclass2,"Agriculture","Agriculture Of Plant-2","5h"));
        bookClasses.add(new BookClass(R.drawable.elclass1,"Agriculture","Agriculture Of Plant","7h 20m"));


        BookClassRecyclerAdapter bookClassRecyclerAdapter1 =new BookClassRecyclerAdapter(getContext(),bookClasses);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getContext(),1, RecyclerView.HORIZONTAL,false);
        binding.rvNewClass.setLayoutManager(gridLayoutManager1);
        binding.rvNewClass.setAdapter(bookClassRecyclerAdapter1);




        return binding.getRoot();
    }
}