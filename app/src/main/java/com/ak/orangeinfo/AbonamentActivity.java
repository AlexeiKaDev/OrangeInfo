package com.ak.orangeinfo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AbonamentActivity extends Activity {
	
	TextView textview,TextView08,TextView06,TextView04,TextView01,TextView02,TextView03,TextView05,TextView07,TextView10,TextView11,TextView12,TextView13,TextView14;
	Button button1,Button01,Button02,Button03,Button04,Button05,Button06,Button07,Button08,Button09,Button10,Button11;
	boolean isRegistered;
	Context mContext;
	final String LOG_TAG = "OrangeLogs";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
	    String operator = telephonyManager.getNetworkOperator();
	    int orange=25901;

        if (Integer.parseInt(operator)!=orange)
        { 	
        	
       	 AlertDialog.Builder builder = new AlertDialog.Builder(AbonamentActivity.this);
   			builder.setCancelable(false);
   			LinearLayout view = (LinearLayout) getLayoutInflater()
   			        .inflate(R.layout.dialog, null);
   			builder.setView(view);
   			builder.setNegativeButton(R.string.exit,new DialogInterface.OnClickListener() {
   				public void onClick(DialogInterface dialog, int id) {
   					dialog.cancel();
   					android.os.Process.killProcess(android.os.Process.myPid());
   				}
   			});
   			
   			
   			AlertDialog alert = builder.create();
   			alert.show();
   	
       }
    
       
	    button1 = (Button) findViewById(R.id.button1);
	    Button01 = (Button) findViewById(R.id.Button01);
	    Button02 = (Button) findViewById(R.id.Button02);
	    Button03 = (Button) findViewById(R.id.Button03);
	    Button04 = (Button) findViewById(R.id.Button04);
	    Button05 = (Button) findViewById(R.id.Button05);
	    Button06 = (Button) findViewById(R.id.Button06);
	    Button07 = (Button) findViewById(R.id.Button07);
	    Button08 = (Button) findViewById(R.id.Button08);
	    Button09 = (Button) findViewById(R.id.Button09);
	    Button10 = (Button) findViewById(R.id.Button10);
	    Button11 = (Button) findViewById(R.id.Button11);
	    
	    TextView01 =(TextView) findViewById(R.id.TextView01);
	    TextView02 =(TextView) findViewById(R.id.TextView02);
	    TextView03 =(TextView) findViewById(R.id.TextView03);
	    TextView04 =(TextView) findViewById(R.id.TextView04);
	    TextView05 =(TextView) findViewById(R.id.TextView05);
	    TextView06 =(TextView) findViewById(R.id.TextView06);
	    TextView07 =(TextView) findViewById(R.id.TextView07);
	    TextView10 =(TextView) findViewById(R.id.TextView10);
	    TextView11 =(TextView) findViewById(R.id.TextView11);
	    TextView12 =(TextView) findViewById(R.id.TextView12);
	    TextView13 =(TextView) findViewById(R.id.TextView13);
	    TextView14 =(TextView) findViewById(R.id.TextView14);
	    
	    Animation  left = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        Animation right = AnimationUtils.loadAnimation(this, R.anim.mytransleft);
        button1.startAnimation(left);
	    Button01.startAnimation(left);
	    Button02.startAnimation(left);
	    Button03.startAnimation(left);
	    Button04.startAnimation(left);
	    Button05.startAnimation(left);
	    Button06.startAnimation(left);
	    Button07.startAnimation(left);
	    Button08.startAnimation(left);
	    Button09.startAnimation(left);
	    Button10.startAnimation(left);
	    Button11.startAnimation(left);
	    
	    TextView01.startAnimation(right);
	    TextView02.startAnimation(right);
	    TextView03.startAnimation(right);
	    TextView04.startAnimation(right);
	    TextView05.startAnimation(right);
	    TextView06.startAnimation(right);
	    TextView07.startAnimation(right);
	    TextView10.startAnimation(right);
	    TextView11.startAnimation(right);
	    TextView12.startAnimation(right);
	    TextView13.startAnimation(right);
	    TextView14.startAnimation(right);
	    
	    
	    OnClickListener sendussd1 = new OnClickListener() {
		       @Override
		       public void onClick(View v) {
		    	   
		    	   String ussd = getString(R.string.credit);
		    	   startActivityForResult(new Intent("android.intent.action.CALL",
		    	   Uri.parse("tel:" + ussd)), 1);
		    	   
		       }
		     };
		 
		     // присвоим обработчик кнопке OK (btnOk)
		     button1.setOnClickListener(sendussd1);
		     
		     
		    OnClickListener sendussd2 = new OnClickListener() {
			       @Override
			       public void onClick(View v) {
			    	   
			    	   String ussd = getString(R.string.info_minute);
			    	   startActivityForResult(new Intent("android.intent.action.CALL",
			    	   Uri.parse("tel:" + ussd)), 1);
			    	   
			       }
			     };
			 
			     // присвоим обработчик кнопке OK (btnOk)
			 Button01.setOnClickListener(sendussd2);
			     
			     OnClickListener sendussd3 = new OnClickListener() {
				       @Override
				       public void onClick(View v) {
				    	   
				    	   String ussd = getString(R.string.balance);
				    	   startActivityForResult(new Intent("android.intent.action.CALL",
				    	   Uri.parse("tel:" + ussd)), 1);
				    	   
				       }
				     };
				 
				     // присвоим обработчик кнопке OK (btnOk)
			 Button02.setOnClickListener(sendussd3);
				     
				  OnClickListener sendussd4 = new OnClickListener() {
					       @Override
					       public void onClick(View v) {
					    	   
					    	   String ussd = getString(R.string.smsinfo);
					    	   startActivityForResult(new Intent("android.intent.action.CALL",
					    	   Uri.parse("tel:" + ussd)), 1);
					    	   
					       }
					     };
					 
					     // присвоим обработчик кнопке OK (btnOk)
			 Button03.setOnClickListener(sendussd4);
			 
			 OnClickListener sendussd5 = new OnClickListener() {
			       @Override
			       public void onClick(View v) {
			    	   
			    	   String ussd = getString(R.string.internet);
			    	   startActivityForResult(new Intent("android.intent.action.CALL",
			    	   Uri.parse("tel:" + ussd)), 1);
			    	   
			       }
			     };
			 
			     // присвоим обработчик кнопке OK (btnOk)
			     Button04.setOnClickListener(sendussd5);
			     
			     OnClickListener sendussd6 = new OnClickListener() {
				       @Override
				       public void onClick(View v) {
				    	   
				    	   String ussd = getString(R.string.my_number);
				    	   startActivityForResult(new Intent("android.intent.action.CALL",
				    	   Uri.parse("tel:" + ussd)), 1);
				    	   
				    	   
				       }
				     };
				 
				     // присвоим обработчик кнопке OK (btnOk)
				     Button05.setOnClickListener(sendussd6);
				  
				     
				     OnClickListener call = new OnClickListener() {
					       @Override
					       public void onClick(View v) {
					    	   String number = getString(R.string.operator_call);
					    	   startActivityForResult(new Intent("android.intent.action.CALL",
					    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
					       }
					     };
					 
					     // присвоим обработчик кнопке OK (btnOk)
					     Button06.setOnClickListener(call);
					     
					     OnClickListener call1 = new OnClickListener() {
						       @Override
						       public void onClick(View v) {
						    	   String number = "112";
						    	   startActivityForResult(new Intent("android.intent.action.CALL",
						    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
						       }
						     };
						 
						     // присвоим обработчик кнопке OK (btnOk)
						     Button07.setOnClickListener(call1); 
						     
						     OnClickListener call2 = new OnClickListener() {
							       @Override
							       public void onClick(View v) {
							    	   String number = "901";
							    	   startActivityForResult(new Intent("android.intent.action.CALL",
							    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
							       }
							     };
							 
							     // присвоим обработчик кнопке OK (btnOk)
							     Button08.setOnClickListener(call2);
							     
							   OnClickListener call3 = new OnClickListener() {
								       @Override
								       public void onClick(View v) {
								    	   String number = "902";
								    	   startActivityForResult(new Intent("android.intent.action.CALL",
								    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
								       }
								     };
								 
								     // присвоим обработчик кнопке OK (btnOk)
								   Button09.setOnClickListener(call3);   
							
								OnClickListener call4 = new OnClickListener() {
								       @Override
								       public void onClick(View v) {
								    	   String number = "903";
								    	   startActivityForResult(new Intent("android.intent.action.CALL",
								    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
								       }
								     };
								 
								     // присвоим обработчик кнопке OK (btnOk)
								 Button10.setOnClickListener(call4);
								 
								 
								 OnClickListener call5 = new OnClickListener() {
								       @Override
								       public void onClick(View v) {
								    	   String number = "904";
								    	   startActivityForResult(new Intent("android.intent.action.CALL",
								    	   Uri.parse("tel:"+ number)), 1);				    	   					    	   
								       }
								     };
								 
								     // присвоим обработчик кнопке OK (btnOk)
								   Button11.setOnClickListener(call5);
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
