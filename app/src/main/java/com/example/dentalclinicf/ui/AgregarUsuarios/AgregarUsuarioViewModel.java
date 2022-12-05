package com.example.dentalclinicf.ui.AgregarUsuarios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgregarUsuarioViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AgregarUsuarioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is AgregarUsuarios fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}