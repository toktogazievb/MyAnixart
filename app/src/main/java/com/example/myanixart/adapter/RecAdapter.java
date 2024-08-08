package com.example.myanixart.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myanixart.Rec;
import com.example.myanixart.databinding.ItemRecommendationBinding;
import com.example.myanixart.viewholder.RecViewHolder;

import java.util.ArrayList;

public class RecAdapter extends RecyclerView.Adapter<RecViewHolder> {

    private ArrayList<Rec> recArrayList;

    public RecAdapter(ArrayList<Rec> recArrayList) {
        this.recArrayList = recArrayList;
    }

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecViewHolder(ItemRecommendationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        holder.onBind(recArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return recArrayList.size();
    }
}
