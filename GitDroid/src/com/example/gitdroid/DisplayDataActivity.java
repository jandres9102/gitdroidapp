package com.example.gitdroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class DisplayDataActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_display_data);
		Intent intent= getIntent();
		String data_us=intent.getStringExtra(MainActivity.EXTRA_MESSAGE); 
		
		
		TextView username= new TextView(this);
		username.setTextSize(40);
		username.setText(data_us);
		
		setContentView(username);
	}
  
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_data, menu);
		return true;
	}
	
}
