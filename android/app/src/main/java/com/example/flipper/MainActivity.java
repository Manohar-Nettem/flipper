package com.example.flipper;

import io.flutter.embedding.android.FlutterActivity;


public class MainActivity extends FlutterActivity {
    Override
    
    protected void onCreate(Bundle savedInstanceState) {
    
        AppCenter.start(getApplication(), "2e42e212-16f4-499b-84d8-9e8487b34bb1", Distribute.class);
        
        AppCenter.setEnabled(true);
        
        super.onCreate(savedInstanceState); 
    }
}
