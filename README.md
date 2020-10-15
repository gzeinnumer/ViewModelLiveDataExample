# ViewModelLiveDataExample
 
 [**LiveData**](https://developer.android.com/topic/libraries/architecture/livedata?hl=id)
 
- Add dependencies on `Gradle`
```gradle
implementation "androidx.lifecycle:lifecycle-viewmodel:2.2.0"
```

- Make Class `MainVM`.
```java
public class MainVM extends ViewModel {
    public MainVM() {
    }

    private final MutableLiveData<String> _str = new MutableLiveData<>();

    public MutableLiveData<String> getStr() {
        return _str;
    }
    public void setStr(String str) {
        _str.setValue(str);
    }
}
```

- Use `ViewModel` on activity
```java
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    MainVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainVM.class);

        viewModel.setStr("Hallo GZeinNumer");

        viewModel.getStr().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG, "onChanged: "+s);
            }
        });
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```

