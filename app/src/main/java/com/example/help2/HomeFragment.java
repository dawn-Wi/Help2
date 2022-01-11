package com.example.help2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    Button home_bt_fastfood;
    Button home_bt_cafe;
    Button home_bt_restaurant;
    Button home_bt_bank;
    Button home_bt_cstore;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        home_bt_fastfood = view.findViewById(R.id.home_bt_fastfood);
        home_bt_cafe = view.findViewById(R.id.home_bt_cafe);
        home_bt_restaurant = view.findViewById(R.id.home_bt_restaurant);
        home_bt_bank = view.findViewById(R.id.home_bt_bank);
        home_bt_cstore = view.findViewById(R.id.home_bt_cstore);

        home_bt_fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeFragment.this).navigate(R.id.action_homeFragment_to_fastfoodFragment);
            }
        });
    }
}