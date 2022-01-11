package com.example.help2;

import static android.view.View.VISIBLE;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FastfoodFragment extends Fragment {
    boolean returnValue = true;
    Button fastfood_bt_맥도날드;
    Button fastfood_bt_롯데리아;
    Button fastfood_bt_KFC;
    Button fastfood_bt_맘스터치;
    Button fastfood_bt_피자헛;
    Button fastfood_bt_사용법;
    Button fastfood_bt_모의사용;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fastfood, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fastfood_bt_맥도날드 = view.findViewById(R.id.fastfood_bt_맥도날드);
        fastfood_bt_롯데리아 = view.findViewById(R.id.fastfood_bt_롯데리아);
        fastfood_bt_KFC = view.findViewById(R.id.fastfood_bt_KFC);
        fastfood_bt_맘스터치 = view.findViewById(R.id.fastfood_bt_맘스터치);
        fastfood_bt_피자헛 = view.findViewById(R.id.fastfood_bt_피자헛);
        fastfood_bt_사용법 = view.findViewById(R.id.fastfood_bt_사용법);
        fastfood_bt_모의사용 = view.findViewById(R.id.fastfood_bt_모의사용);

        fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
        fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);

        fastfood_bt_맥도날드.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(returnValue == false){
                    fastfood_bt_맥도날드.setBackgroundResource(R.drawable.button1);
                    returnValue=true;
                    fastfood_bt_롯데리아.setEnabled(false);
                    fastfood_bt_KFC.setEnabled(false);
                    fastfood_bt_맘스터치.setEnabled(false);
                    fastfood_bt_피자헛.setEnabled(false);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.VISIBLE);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.VISIBLE);
                    fastfood_bt_모의사용.setEnabled(true);
                }
                else{
                    fastfood_bt_맥도날드.setBackgroundResource(R.drawable.button2);
                    returnValue = false;
                    fastfood_bt_롯데리아.setEnabled(true);
                    fastfood_bt_KFC.setEnabled(true);
                    fastfood_bt_맘스터치.setEnabled(true);
                    fastfood_bt_피자헛.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);
                }
            }
        });
        fastfood_bt_롯데리아.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(returnValue == false){
                    fastfood_bt_롯데리아.setBackgroundResource(R.drawable.button1);
                    returnValue=true;
                    fastfood_bt_맥도날드.setEnabled(false);
                    fastfood_bt_KFC.setEnabled(false);
                    fastfood_bt_맘스터치.setEnabled(false);
                    fastfood_bt_피자헛.setEnabled(false);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.VISIBLE);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.VISIBLE);
                    fastfood_bt_모의사용.setEnabled(true);
                }
                else{
                    fastfood_bt_롯데리아.setBackgroundResource(R.drawable.button2);
                    returnValue = false;
                    fastfood_bt_맥도날드.setEnabled(true);
                    fastfood_bt_KFC.setEnabled(true);
                    fastfood_bt_맘스터치.setEnabled(true);
                    fastfood_bt_피자헛.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);
                }
            }
        });
        fastfood_bt_KFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(returnValue == false){
                    fastfood_bt_KFC.setBackgroundResource(R.drawable.button1);
                    returnValue=true;
                    fastfood_bt_맥도날드.setEnabled(false);
                    fastfood_bt_롯데리아.setEnabled(false);
                    fastfood_bt_맘스터치.setEnabled(false);
                    fastfood_bt_피자헛.setEnabled(false);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.VISIBLE);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.VISIBLE);
                    fastfood_bt_모의사용.setEnabled(true);
                }
                else{
                    fastfood_bt_KFC.setBackgroundResource(R.drawable.button2);
                    returnValue = false;
                    fastfood_bt_맥도날드.setEnabled(true);
                    fastfood_bt_롯데리아.setEnabled(true);
                    fastfood_bt_맘스터치.setEnabled(true);
                    fastfood_bt_피자헛.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);
                }
            }
        });
        fastfood_bt_맘스터치.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(returnValue == false){
                    fastfood_bt_맘스터치.setBackgroundResource(R.drawable.button1);
                    returnValue=true;
                    fastfood_bt_맥도날드.setEnabled(false);
                    fastfood_bt_롯데리아.setEnabled(false);
                    fastfood_bt_KFC.setEnabled(false);
                    fastfood_bt_피자헛.setEnabled(false);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.VISIBLE);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.VISIBLE);
                    fastfood_bt_모의사용.setEnabled(true);
                }
                else{
                    fastfood_bt_맘스터치.setBackgroundResource(R.drawable.button2);
                    returnValue = false;
                    fastfood_bt_맥도날드.setEnabled(true);
                    fastfood_bt_롯데리아.setEnabled(true);
                    fastfood_bt_KFC.setEnabled(true);
                    fastfood_bt_피자헛.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);
                }
            }
        });
        fastfood_bt_피자헛.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(returnValue == false){
                    fastfood_bt_피자헛.setBackgroundResource(R.drawable.button1);
                    returnValue=true;
                    fastfood_bt_맥도날드.setEnabled(false);
                    fastfood_bt_롯데리아.setEnabled(false);
                    fastfood_bt_맘스터치.setEnabled(false);
                    fastfood_bt_KFC.setEnabled(false);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.VISIBLE);
                    fastfood_bt_사용법.setEnabled(true);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.VISIBLE);
                    fastfood_bt_모의사용.setEnabled(true);
                }
                else{
                    fastfood_bt_피자헛.setBackgroundResource(R.drawable.button2);
                    returnValue = false;
                    fastfood_bt_맥도날드.setEnabled(true);
                    fastfood_bt_롯데리아.setEnabled(true);
                    fastfood_bt_맘스터치.setEnabled(true);
                    fastfood_bt_KFC.setEnabled(true);
                    fastfood_bt_사용법.setVisibility(fastfood_bt_사용법.INVISIBLE);
                    fastfood_bt_모의사용.setVisibility(fastfood_bt_모의사용.INVISIBLE);
                }
            }
        });

    }
}