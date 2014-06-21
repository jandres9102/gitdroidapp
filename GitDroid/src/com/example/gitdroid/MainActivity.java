package com.example.gitdroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.gitdroid.MESSAGE";
	//public final static String password_data = "com.example.gitdroid.MESSAGE";
	String user1= "jandres9102";
	String password_user="1234";
	String data;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendData(View view)
	{
		Intent intent= new Intent(this, DisplayDataActivity.class);
		//Intent intent1= new Intent(this, DisplayDataActivity.class);
		EditText user=(EditText) findViewById(R.id.user);
		EditText password=(EditText) findViewById(R.id.password);
		String users= user.getText().toString();
		String passwords= password.getText().toString();
		if(user1.equals(users) & password_user.equals(passwords) )
		{
			data="user: "+users+" password: "+passwords;
			intent.putExtra(EXTRA_MESSAGE,data);
			//intent1.putExtra(password_data,passwords);
			startActivity(intent);
		}
		
		else
		{
			Toast error= Toast.makeText(this, "your data are wrong", Toast.LENGTH_LONG);
			error.show();
		}
	}
}
