package com.ak.orangeinfo;

import java.util.Arrays;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

public class Widget extends AppWidgetProvider {

	public static String IntentAction = "intentaction";
	public static String MinuteInfo = "minuteinfo";
	public static String MyBalance = "mybalance";
	public static String InternetTraffic = "internettraffic";
	public static String MyNumber = "mynumber";
 
  
  final String LOG_TAG = "myLogs";

  @Override
  public void onEnabled(Context context) {
    super.onEnabled(context);
    Log.d(LOG_TAG, "onEnabled");
    
  }


  @Override
  public void onDeleted(Context context, int[] appWidgetIds) {
    super.onDeleted(context, appWidgetIds);
    Log.d(LOG_TAG, "onDeleted " + Arrays.toString(appWidgetIds));
  }

  @Override
  public void onDisabled(Context context) {
    super.onDisabled(context);
    Log.d(LOG_TAG, "onDisabled");
  }

  
  
  @Override
  public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
      final int N = appWidgetIds.length;

      // Perform this loop procedure for each App Widget that belongs to this provider
      for (int i=0; i<N; i++) {
          int appWidgetId = appWidgetIds[i];
          RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
          // Create an Intent to launch ExampleActivity
          Intent intent = new Intent(context, OrangeService.class);
          		 intent.setAction(IntentAction);
          		 intent.putExtra("ussd", "1");
          PendingIntent pendingIntent = PendingIntent.getService(context, 0, intent, Intent.FLAG_ACTIVITY_CLEAR_TASK);
          
          
          // Get the layout for the App Widget and attach an on-click listener
          // to the button
          views.setOnClickPendingIntent(R.id.Button01, pendingIntent);
          
          appWidgetManager.updateAppWidget(appWidgetId, views);
          /****************************************************/
          Intent intent1 = new Intent(context, OrangeService.class);
   		  intent1.setAction(MinuteInfo);
   		  intent1.putExtra("ussd", "2");
   		  PendingIntent pendingIntent1 = PendingIntent.getService(context, 0, intent1, Intent.FLAG_ACTIVITY_CLEAR_TASK);
   
   
   		  // Get the layout for the App Widget and attach an on-click listener
   		  // to the button
   		  
   		  views.setOnClickPendingIntent(R.id.button3, pendingIntent1);
   
   		  appWidgetManager.updateAppWidget(appWidgetId, views);
   		  
   		 /****************************************************/
          Intent intent2 = new Intent(context, OrangeService.class);
   		  intent2.setAction(MyBalance);
   		  intent2.putExtra("ussd", "3");
   		  PendingIntent pendingIntent2 = PendingIntent.getService(context, 0, intent2, Intent.FLAG_ACTIVITY_CLEAR_TASK);
   
   
   		  // Get the layout for the App Widget and attach an on-click listener
   		  // to the button
   		  
   		  views.setOnClickPendingIntent(R.id.button4, pendingIntent2);
   
   		  appWidgetManager.updateAppWidget(appWidgetId, views);
   		  
   		 /****************************************************/
          Intent intent3 = new Intent(context, OrangeService.class);
   		  intent3.setAction(InternetTraffic);
   		  intent3.putExtra("ussd", "4");
   		  PendingIntent pendingIntent3 = PendingIntent.getService(context, 0, intent3, Intent.FLAG_ACTIVITY_CLEAR_TASK);
   
   
   		  // Get the layout for the App Widget and attach an on-click listener
   		  // to the button
   		  
   		  views.setOnClickPendingIntent(R.id.button1, pendingIntent3);
   
   		  appWidgetManager.updateAppWidget(appWidgetId, views);
   		  
   		 /****************************************************/
          Intent intent4 = new Intent(context, OrangeService.class);
   		  intent4.setAction(MyNumber);
   		  intent4.putExtra("ussd", "5");
   		  PendingIntent pendingIntent4 = PendingIntent.getService(context, 0, intent4, Intent.FLAG_ACTIVITY_CLEAR_TASK);
   
   
   		  // Get the layout for the App Widget and attach an on-click listener
   		  // to the button
   		  
   		  views.setOnClickPendingIntent(R.id.button2, pendingIntent4);
   
   		  appWidgetManager.updateAppWidget(appWidgetId, views);
     
      }
  }
  

}