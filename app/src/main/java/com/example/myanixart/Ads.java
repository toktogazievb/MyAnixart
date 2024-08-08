package com.example.myanixart;

public class Ads {

    private String adsName, adsDesc, adsImg;

    public Ads(String adsName, String adsDesc, String adsImg) {
        this.adsName = adsName;
        this.adsDesc = adsDesc;
        this.adsImg = adsImg;
    }

    public String getAdsName() {
        return adsName;
    }

    public String getAdsDesc() {
        return adsDesc;
    }

    public String getAdsImg() {
        return adsImg;
    }
}
