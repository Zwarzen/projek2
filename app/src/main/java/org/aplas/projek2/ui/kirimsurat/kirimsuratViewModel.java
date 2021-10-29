package org.aplas.projek2.ui.kirimsurat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class kirimsuratViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public kirimsuratViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Kirim Surat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}