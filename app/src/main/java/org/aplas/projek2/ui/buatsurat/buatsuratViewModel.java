package org.aplas.projek2.ui.buatsurat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class buatsuratViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public buatsuratViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Cek Surat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}