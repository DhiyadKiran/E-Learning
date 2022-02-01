package com.example.e_learning.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_learning.Model.BookClass;
import com.example.e_learning.R;
import com.example.e_learning.databinding.BookClassSampleBinding;

import java.util.ArrayList;

public class BookClassRecyclerAdapter extends RecyclerView.Adapter<BookClassRecyclerAdapter.viewHolder> {

    public BookClassRecyclerAdapter(Context context, ArrayList<BookClass> bookClasses) {
        this.context = context;
        this.bookClasses = bookClasses;
    }

    Context context;
    ArrayList<BookClass> bookClasses;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.book_class_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        BookClass  bookClass = bookClasses.get(position);

        holder.binding.igSampleHomeClass.setImageResource(bookClass.getClassImage());
        holder.binding.txClassSubject.setText(bookClass.getClassSubject());
        holder.binding.txClassName.setText(bookClass.getClassName());
        holder.binding.txTime.setText(bookClass.getClassTime());

    }

    @Override
    public int getItemCount() {
        return bookClasses.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        BookClassSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = BookClassSampleBinding.bind(itemView);
        }
    }
}


