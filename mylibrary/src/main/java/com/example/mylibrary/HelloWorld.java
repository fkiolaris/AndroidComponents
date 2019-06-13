package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class HelloWorld {

    public void sayHello(Context context){
        Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
