package com.example.myanixart.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myanixart.Rec;
import com.example.myanixart.databinding.ItemRecommendationBinding;

public class RecViewHolder extends RecyclerView.ViewHolder {

    public ItemRecommendationBinding viewBinding;

    public RecViewHolder(ItemRecommendationBinding viewBinding) {
        super(viewBinding.getRoot());
        this.viewBinding = viewBinding;
    }

    public void onBind(Rec rec){
        viewBinding.tvRec.setText(rec.getRecName());
        Glide.with(itemView.getContext()).load(rec.getRecImg()).into(viewBinding.imgBtnRec);

    }}
