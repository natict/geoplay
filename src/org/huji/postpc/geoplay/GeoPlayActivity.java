package org.huji.postpc.geoplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class GeoPlayActivity extends Activity implements OnClickListener {
	private Button btnStart;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }
        
    public void onClick(View v) {
    	//Start the background service
        startService(new Intent(GeoPlayService.class.getName()));
    }
}