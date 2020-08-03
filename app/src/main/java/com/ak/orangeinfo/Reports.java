package com.ak.orangeinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Reports extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.reports);
	    // TODO Auto-generated method stub
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		
		
		
		
		MenuItem mi = menu.add(0, 1, 0, getText(R.string.action_settings));
		MenuItem mispravka = menu.add(0, 2, 0, getText(R.string.about));
					
		
		mi.setIntent(new Intent(this, PrefActivity.class));				
		mispravka.setIntent(new Intent(this, Info.class));	
		
		
	//	getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);		
		    
	}

}
