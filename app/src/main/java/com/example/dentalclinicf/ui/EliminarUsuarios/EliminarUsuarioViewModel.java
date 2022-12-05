package com.example.dentalclinicf.ui.EliminarUsuarios;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EliminarUsuarioViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EliminarUsuarioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is EliminarUsuarios fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}