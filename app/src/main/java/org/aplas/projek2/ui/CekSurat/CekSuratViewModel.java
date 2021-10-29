package org.aplas.projek2.ui.CekSurat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CekSuratViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CekSuratViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Cek Surat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}