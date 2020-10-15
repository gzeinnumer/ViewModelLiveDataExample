package com.gzeinnumer.viewmodellivedataexample;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class MainVM extends ViewModel {
    public MainVM() {
    }

    private final MutableLiveData<String> _str = new MutableLiveData<>();


    public LiveData<String> getStr = Transformations.switchMap(_str, new Function<String, LiveData<String>>() {
        @Override
        public LiveData<String> apply(String input) {
            return _str;
        }
    });

    public MutableLiveData<String> getStr() {
        return _str;
    }
    public void setStr(String str) {
        _str.setValue(str);
    }
}
