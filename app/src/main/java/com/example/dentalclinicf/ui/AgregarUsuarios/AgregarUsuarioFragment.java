package com.example.dentalclinicf.ui.AgregarUsuarios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dentalclinicf.databinding.FragmentAgregarUsuarioBinding;

public class AgregarUsuarioFragment extends Fragment {

    private FragmentAgregarUsuarioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AgregarUsuarioViewModel agregarUsuarioViewModel =
                new ViewModelProvider(this).get(AgregarUsuarioViewModel.class);

        binding = FragmentAgregarUsuarioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        agregarUsuarioViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}