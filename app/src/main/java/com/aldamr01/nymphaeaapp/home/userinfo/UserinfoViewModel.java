package com.aldamr01.nymphaeaapp.home.userinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserinfoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UserinfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}