package org.huji.postpc.geoplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;

public class PlayerActivity extends Activity{
	private ImageButton play;
	private MediaController mSettings;
	private MediaController select;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.player_layout);
        
        play = (ImageButton) findViewById(R.id.mediaController1);
        mSettings = (MediaController) findViewById(R.id.mediaController3);
        select = (MediaController) findViewById(R.id.mediaController2);
        
//        play.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				playStream();
//				
//			}
//		});
			
		
	}
	
	private void playStream() {
		// TODO Auto-generated method stub
		
	}
	
}
