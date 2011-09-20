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
	private CheckBox displayWelcomeMsg;
	
	private boolean showWelcomeMsg;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }
    
//    public void setHomeScreenLayout(View view) {
//    	Intent myIntent = new Intent(view.getContext(), HomeActivity.class);
//        startActivityForResult(myIntent, 0);
//    }
//    public void setPlayerLayout(View view) {
//    	Intent myIntent = new Intent(view.getContext(), PlayerActivity.class);
//        startActivityForResult(myIntent, 0);
//    } 
    
    public void onClick(View v) {
    
    }
}