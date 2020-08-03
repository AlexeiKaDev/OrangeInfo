package com.ak.orangeinfo;


import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.app.TabActivity;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	
	SharedPreferences sp;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		startService(new Intent(this, OrangeService.class));
						
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		
		int actionBarTitle = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
	    TextView actionBarTitleView = (TextView) getWindow().findViewById(actionBarTitle);
	    Typeface fonts = Typeface.createFromAsset(getAssets(), "fonts/brlnsdb.TTF");
	    if(actionBarTitleView != null){
	        actionBarTitleView.setTypeface(fonts);
	        actionBarTitleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
	    }	
	    
	    TabHost tabHost = getTabHost();
        
        // инициализация была выполнена в getTabHost
        // метод setup вызывать не нужно
        TabHost.TabSpec tabSpec;       
        
        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator(getText(R.string.abonament));
        tabSpec.setContent(new Intent(this, AbonamentActivity.class));
        tabHost.addTab(tabSpec);
        
        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator(getText(R.string.prepay));
        tabSpec.setContent(new Intent(this, PrepayActivity.class));
        tabHost.addTab(tabSpec);
        
        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setIndicator(getText(R.string.more));
        tabSpec.setContent(new Intent(this, Reports.class));
        tabHost.addTab(tabSpec);
        
        TabWidget widget = tabHost.getTabWidget();
        for(int i = 0; i < widget.getChildCount(); i++) {
            View v = widget.getChildAt(i);

            // Look for the title view to ensure this is an indicator and not a divider.
            TextView tv = (TextView)v.findViewById(android.R.id.title);
            if(tv == null) {
                continue;
            }
            v.setBackgroundResource(R.drawable.tab_indicator_ab_orangeinfo);
        }
        
        

	}
	
	
	
	@Override	
	protected void onPause() {
		super.onPause();
		
	}
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		stopService(new Intent(this, OrangeService.class));
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		
		
		
		MenuItem mi = menu.add(0, 1, 0, getText(R.string.action_settings));
		MenuItem mispravka = menu.add(0, 2, 0, getText(R.string.about));
					
		
		mi.setIntent(new Intent(this, PrefActivity.class));				
		mispravka.setIntent(new Intent(this, Info.class));	
		
		
	//	getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);		
		    
	}
 
	
}
