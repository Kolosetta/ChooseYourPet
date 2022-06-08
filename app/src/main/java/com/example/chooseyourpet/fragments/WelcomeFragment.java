package com.example.chooseyourpet.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.chooseyourpet.R;
import com.example.chooseyourpet.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends Fragment {

    FragmentWelcomeBinding binding;

    public WelcomeFragment() {
        super(R.layout.fragment_welcome);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentWelcomeBinding.bind(view); //Инициализируем binding из view. Внутри onViewCreated в параметр view передается та view, которая создана из макета


        binding.button1.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_welcomeFragment_to_wikiFragment);
            Toast.makeText(getContext(), "dadasd", Toast.LENGTH_SHORT).show();

        });
    }
}
