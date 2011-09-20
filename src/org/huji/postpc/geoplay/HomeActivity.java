package org.huji.postpc.geoplay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity{
	private Button about;
	private Button settings;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.unused_app_layout);
        
        about = (Button) findViewById(R.id.button2);
        settings = (Button) findViewById(R.id.button3);
		
		//Create a new service
//		Context myContext = this;
//		Intent serviceIntent = new Intent();
//		serviceIntent.setClass(myContext, GeoPlayService.class);
//		myContext.startService(serviceIntent);
        
        
      }

public void setSettingsLayout(View view) {
	Intent myIntent = new Intent(view.getContext(), SettingsActivity.class);
    startActivityForResult(myIntent, 0);
}
}