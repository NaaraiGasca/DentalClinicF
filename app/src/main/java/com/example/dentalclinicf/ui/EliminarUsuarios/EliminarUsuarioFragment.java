package com.example.dentalclinicf.ui.EliminarUsuarios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dentalclinicf.databinding.FragmentEliminarUsuariosBinding;

public class EliminarUsuarioFragment extends Fragment {

    private FragmentEliminarUsuariosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EliminarUsuarioViewModel eliminarUsuarioViewModel =
                new ViewModelProvider(this).get(EliminarUsuarioViewModel.class);

        binding = FragmentEliminarUsuariosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        eliminarUsuarioViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}