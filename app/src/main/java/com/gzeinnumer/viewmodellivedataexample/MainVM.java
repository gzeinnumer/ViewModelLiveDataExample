package com.gzeinnumer.viewmodellivedataexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainVM extends ViewModel {
    public MainVM() {
    }

    //https://developer.android.com/topic/libraries/architecture/livedata?hl=id#:~:text=Ringkasan%20LiveData%20Bagian%20dari%20Android,aktivitas%2C%20fragmen%2C%20atau%20layanan.
    private final MutableLiveData<String> _str = new MutableLiveData<>();

    public MutableLiveData<String> getStr() {
        return _str;
    }
    public void setStr(String str) {
        _str.setValue(str);
    }
}
