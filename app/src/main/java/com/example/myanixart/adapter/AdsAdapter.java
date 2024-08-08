package com.example.myanixart.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myanixart.Ads;
import com.example.myanixart.databinding.ItemAdsBinding;
import com.example.myanixart.viewholder.AdsViewHolder;

import java.util.ArrayList;

public class AdsAdapter extends RecyclerView.Adapter<AdsViewHolder> {

    private ArrayList<Ads> adsArrayList;

    public AdsAdapter(ArrayList<Ads> adsArrayList) {
        this.adsArrayList = adsArrayList;
    }

    @NonNull
    @Override
    public AdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdsViewHolder(ItemAdsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdsViewHolder holder, int position) {
        holder.onBind(adsArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return adsArrayList.size();
    }
}
