package com.example.internet;

import com.example.internet.R;
import com.example.internet.getEsferas;
import com.example.internet.MainActivity;
import com.example.internet.putCasas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btn_get).setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				new getEsferas(MainActivity.this).execute();
			}
		});
		findViewById(R.id.btn_post).setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				new putCasas(MainActivity.this, "casas", 2).execute();
			}
		});
        
        
    }


    
}
