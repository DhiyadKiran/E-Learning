package com.example.e_learning.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_learning.Fragments.HomeFragment;
import com.example.e_learning.Fragments.VideoFragment;
import com.example.e_learning.Model.HomeClass;
import com.example.e_learning.R;
import com.example.e_learning.databinding.HomeClassSampleBinding;

import java.util.ArrayList;

public class HomeClassRecyclerAdapter extends RecyclerView.Adapter<HomeClassRecyclerAdapter.viewHolder>{

   Context context;
    ArrayList<HomeClass> homeClasses;

    public HomeClassRecyclerAdapter(Context context, ArrayList<HomeClass> homeClasses) {
        this.context = context;
        this.homeClasses = homeClasses;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_class_sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
           HomeClass homeClass = homeClasses.get(position);

           holder.binding.igSampleHomeClass.setImageResource(homeClass.getClassImage());
           holder.binding.txClassSubject.setText(homeClass.getClassSubject());
           holder.binding.txClassName.setText(homeClass.getClassName());
           holder.binding.txTime.setText(homeClass.getClassTime());

           holder.itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                           .replace(R.id.frMainContainer , new VideoFragment())
                           .addToBackStack(null)
                           .commit();
               }
           });
    }

    @Override
    public int getItemCount() {
        return homeClasses.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
          HomeClassSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
              binding = HomeClassSampleBinding.bind(itemView);
        }
    }
}
