package com.example.myanixart.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myanixart.Ads;
import com.example.myanixart.databinding.ItemAdsBinding;

public class AdsViewHolder extends RecyclerView.ViewHolder {

    public ItemAdsBinding viewBinding;

    public AdsViewHolder(ItemAdsBinding viewBinding) {
        super(viewBinding.getRoot());
        this.viewBinding = viewBinding;
    }

    public void onBind(Ads ads){
        viewBinding.tvAdsName.setText(ads.getAdsName());
        viewBinding.tvAdsDescr.setText(ads.getAdsDesc());
        Glide.with(itemView.getContext()).load(ads.getAdsImg()).into(viewBinding.ivAds);
    }
}

