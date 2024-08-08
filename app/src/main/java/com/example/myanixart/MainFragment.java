package com.example.myanixart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myanixart.adapter.AdsAdapter;
import com.example.myanixart.adapter.RecAdapter;
import com.example.myanixart.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    public RecyclerView recyclerViewAds, recyclerViewRec;
    FragmentMainBinding viewBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentMainBinding.inflate(getLayoutInflater());
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewAds = requireView().findViewById(R.id.rvAds);
        recyclerViewRec = requireView().findViewById(R.id.rvRec);

        ArrayList<Rec> recArrayList = new ArrayList<>();
        ArrayList<Ads> adsArrayList = new ArrayList<>();

        Ads ads1 = new Ads("Гуррен-Лаганн", "Постапокалипсистический мир...", "https://static1.cbrimages.com/wordpress/wp-content/uploads/2022/06/Gurren-Lagann-1.jpg");
        Ads ads2 = new Ads("Наруто: Ураганные хроники", "Наруто возвращается в Коноху спустя 2 года...", "https://imgsrv.crunchyroll.com/cdn-cgi/image/fit=contain,format=auto,quality=85,width=1200,height=675/catalog/crunchyroll/3f283002b47c62b1e5d311c45f95c97e.jpg");
        Ads ads3 = new Ads("Невероятные приключения ДжоДжо", "Джотаро Куджо, внук Джозефа Джостера...", "https://static.bandainamcoent.eu/high/jojo/jojo-bizarre-adventure-all-star-battle-r/02-news/JOJOASBR_launchTrailer_thumbnail.jpg");

        adsArrayList.add(ads1);
        adsArrayList.add(ads2);
        adsArrayList.add(ads3);

        AdsAdapter adsAdapter = new AdsAdapter(adsArrayList);
        viewBinding.rvAds.setAdapter(adsAdapter);

        Rec rec1 = new Rec("Магическая битва","https://imgsrv.crunchyroll.com/cdn-cgi/image/fit=contain,format=auto,quality=85,width=480,height=720/catalog/crunchyroll/e4e80c83c792d81c138e320874dbdffc.jpe");
        Rec rec2 = new Rec("Чёрный клевер","https://m.media-amazon.com/images/M/MV5BMjU0MWMzNTctMjM5MC00MmVhLWIzZjQtYzk3OGRiYjQ2NDk2XkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_.jpg");
        Rec rec3 = new Rec("Врата Штейна","https://m.media-amazon.com/images/M/MV5BMjUxMzE4ZDctODNjMS00MzIwLThjNDktODkwYjc5YWU0MDc0XkEyXkFqcGdeQXVyNjc3OTE4Nzk@._V1_FMjpg_UX1000_.jpg");
        Rec rec4 = new Rec("Этот глупый свин не понимает мечту девочки-зайки ","https://desu.shikimori.one/uploads/poster/animes/37450/main-5b8e6c1f6fd0ab1edf523d7085393479.webp");
        Rec rec5 = new Rec("Торадора","https://static.wikia.nocookie.net/tora-dora/images/3/3c/Tdport_cover_transparent.png/revision/latest?cb=20160508055453");
        Rec rec6 = new Rec("Этот замечательный мир","https://desu.shikimori.one/uploads/poster/animes/30831/main_2x-86b9056ac3f2c4a0b3b29b3b0a3709e9.webp");

        recArrayList.add(rec1);
        recArrayList.add(rec2);
        recArrayList.add(rec3);
        recArrayList.add(rec6);
        recArrayList.add(rec4);
        recArrayList.add(rec5);

        RecAdapter recAdapter = new RecAdapter(recArrayList);
        viewBinding.rvRec.setAdapter(recAdapter);

    }
}