package com.ak.orangeinfo;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;

public class OrangeService extends Service {

	final String LOG_TAG = "OrangeLogs";
	
	public void onCreate() {
	    super.onCreate();
	    Log.d(LOG_TAG, "onCreate");	   	       
	       	     
	  }
	  
	  public int onStartCommand(Intent intent, int flags, int startId) {
	    Log.d(LOG_TAG, "onStartCommand");
	    
		final String action = intent.getAction();
			
	       if (action!= null) {
	            String ussd = "null";
	            try {
	                  ussd = intent.getStringExtra("ussd");
	            } catch (NullPointerException e) {
	                  Log.e("Error", "ussd = null");
	            }
	            sendUssd(Integer.parseInt(ussd));
	        
	       }
	       this.stopSelf();
	    return super.onStartCommand(intent, flags, startId);
	    
	  }

	

	public void onDestroy() {
	    super.onDestroy();
	    Log.d(LOG_TAG, "onDestroy");
	  }

	  public IBinder onBind(Intent intent) {
	    Log.d(LOG_TAG, "onBind");
	    return null;
	  }

	  private void sendUssd(int ussd) {
			// TODO Auto-generated method stub
		  
		 String ussdcode = null;
		  switch (ussd) {
		      case 1:  ussdcode = "*99#";
		      break;
		      case 2:  ussdcode = "*133#";
		      break;
		      case 3:  ussdcode = "*133*1#";
		      break;
		      case 4:  ussdcode = "*133*2#";
		      break;
		      case 5:  ussdcode = "*133*3*1#";
		      break;
		      case 6:  ussdcode = "*133*3*2#";
              break;
		      case 7:  ussdcode = "777";
              break;
		      case 8:  ussdcode = "*99#";
              break;
		      case 9:  ussdcode = "*133#";
              break;
		      case 10:  ussdcode = "*133*1#";
              break;
		      case 11:  ussdcode = "*133*2#";
              break;
		      case 12:  ussdcode = "*133*3#";
              break;
		      case 13:  ussdcode = "5544";
              break;
		      case 14:  ussdcode = "*100*2#";
              break;
		      case 15:  ussdcode = "*100*5#";
              break;
		      case 16:  ussdcode = "*100*6#";
              break;
		      case 17:  ussdcode = "*100*31#";
              break;
		      case 18:  ussdcode = "*100*32#";
              break;
		      case 19:  ussdcode = "*100*33#";
              break;
		      case 20:  ussdcode = "*100*34#";
              break;
		      case 21:  ussdcode = "*100*9#";
              break;
		      case 22:  ussdcode = "*100*7#";
              break;
		      case 23:  ussdcode = "789";
              break;
		      case 24:  ussdcode = "200";
              break;
		      case 25:  ussdcode = "777";
              break;
		      case 26:  ussdcode = "112";
              break;
		      case 27:  ussdcode = "901";
              break;
		      case 28:  ussdcode = "902";
              break;
		      case 29:  ussdcode = "903";
              break;
		      case 30:  ussdcode = "904";
              break;
		  }
		  Log.d(LOG_TAG, "отравка кода " + ussdcode);
		    Intent dialogIntent = new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdcode));
		    dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		    this.startActivity(dialogIntent);    
		   
			
		}
	  
	  
	}
