package com.example.hackaton.feature.ui.analizi;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hackaton.api.emailcode.EmailCodeAPI;
import com.example.hackaton.feature.activities.mainscreen.KorzinaActivity;
import com.example.hackaton.feature.adapters.CatalogAdapter;
import com.example.hackaton.feature.adapters.CustomBannerAdapter;
import com.example.hackaton.model.Banner;
import com.example.hackaton.R;
import com.example.hackaton.model.Order;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AnaliziFragment extends Fragment {
    RecyclerView recyclerView;
    List<Order> aror = new ArrayList<>();
    Order or1 = new Order("0", "Кладовщик", "",
            "115 000", "Популярные", "1 день", "", "");
    Order or2 = new Order("1", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "COVID", "1 день", "", "");
    Order or3 = new Order("3", "Кладовщик", "",
            "115 000", "Популярные", "1 день", "", "");
    Order or4 = new Order("4", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "Комплексные", "1 день", "", "");
    Order or5 = new Order("0", "Кладовщик", "",
            "115 000", "COVID", "1 день", "", "");
    Order or6 = new Order("1", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "COVID", "1 день", "", "");
    Order or7 = new Order("3", "Кладовщик", "",
            "115 000", "Популярные", "1 день", "", "");
    Order or8 = new Order("4", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "COVID", "1 день", "", "");
    Order or9 = new Order("0", "Кладовщик", "",
            "115 000", "Популярные", "1 день", "", "");
    Order or10 = new Order("1", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "COVID", "1 день", "", "");
    Order or11 = new Order("3", "Кладовщик", "",
            "115 000", "Популярные", "1 день", "", "");
    Order or12 = new Order("4", "Клинический анализ крови с лейкоцитарной формулировкой", "",
            "690", "Комплексные", "1 день", "", "");

    Banner ba1 = new Banner("1", "", "", "", "");
    Banner ba2 = new Banner("2", "", "", "", "");
    ArrayList<Order> pop = new ArrayList<>();
    ArrayList<Order> covid = new ArrayList<>();
    ArrayList<Order> comp = new ArrayList<>();

    RecyclerView recyclerView2;
    AppCompatButton b1;
    AppCompatButton b2;
    AppCompatButton b3;
    CardView korz;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }





    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_analizi, container, false);

//        recyclerView2 = v.findViewById(R.id.catalogrec);
        korz = v.findViewById(R.id.cardforkorz);
        b1 = v.findViewById(R.id.b1);
        b2 = v.findViewById(R.id.b2);
        b3 = v.findViewById(R.id.b3);

//
//
//        aror.add(or1);
//        aror.add(or2);
//        aror.add(or3);
//        aror.add(or4);
//        aror.add(or6);
//        aror.add(or5);
//        aror.add(or7);
//        aror.add(or8);
//        aror.add(or9);
//        aror.add(or10);
//        aror.add(or11);
//        aror.add(or12);
//
//        for(int i = 0; i < aror.size(); i ++) {
//            if(aror.get(i).getCategory().equals("Популярные")) {
//                pop.add(aror.get(i));
//               //Log.d("sortin", "added to pop: " + aror.get(i).getName().substring(0, 10));
//            } else if(aror.get(i).getCategory().equals("Оператор")) {
//                covid.add(aror.get(i));
//                //Log.d("sortin", "added to covid: " + aror.get(i).getName().substring(0, 10));
//            } else {
//                comp.add(aror.get(i));
//                //Log.d("sortin", "added to hard: " + aror.get(i).getName().substring(0, 10));
//            }
//        }
/////*
//        CatalogAdapter catalogAdapter = new CatalogAdapter(pop);
//        recyclerView2.setAdapter(catalogAdapter);
//        LinearLayoutManager lm2 = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);
//        recyclerView2.setLayoutManager(lm2);

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                catalogAdapter.setLocalDataSet(pop);
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                catalogAdapter.setLocalDataSet(covid);
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                catalogAdapter.setLocalDataSet(comp);
//            }
//        });
        korz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson = new Gson();
//                String json = gson.toJson(catalogAdapter.korza);
                Intent i = new Intent(getContext(), KorzinaActivity.class);
//                i.putExtra("korzina", json);
                startActivity(i);
            }
        });
//*/
        return v;
    }

}