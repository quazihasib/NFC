package com.example.nfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	@Override
	public void onCreate(Bundle savedState)
	{
		super.onCreate(savedState);
		setContentView(R.layout.main_page);

		Button btnReceiveNFC = (Button) findViewById(R.id.ReceiveNFC);
		btnReceiveNFC.setOnClickListener(new OnClickListener() 
		{
			 @Override
			public void onClick(View arg0)
			{
				startActivity(new Intent(MainActivity.this, ReceiveNFC.class));
			}
		});

		Button btnSendNFC = (Button) findViewById(R.id.SendNFC);
		btnSendNFC.setOnClickListener(new OnClickListener() 
		{
		    @Override
			public void onClick(View arg0) 
		    {
				startActivity(new Intent(MainActivity.this, SendNFC.class));
			}
		});
	}

	@Override
	public void onResume()
	{
		super.onResume();
	}

	@Override
	public void onPause() 
	{
		super.onPause();
	}

}
