package com.ak.orangeinfo;

import java.util.Arrays;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.widget.RemoteViews;

public class SmallWidget extends AppWidgetProvider {

	public static String IntentAction = "intentaction";
	public static String MinuteInfo = "minuteinfo";
	public static String MyBalance = "mybalance";
	public static String InternetTraffic = "internettraffic";
	public static String MyNumber = "mynumber";
 
  
  final static String LOG_TAG = "myLogs";

  @Override
  public void onEnabled(Context context) {
    super.onEnabled(context);
    Log.d(LOG_TAG, "onEnabled");
    
  }


  @Override
  public void onDeleted(Context context, int[] appWidgetIds) {
    super.onDeleted(context, appWidgetIds);
    
    // Удаляем Preferences
    Editor editor = context.getSharedPreferences(
        ConfigWidget.WIDGET_PREF, Context.MODE_PRIVATE).edit();
    for (int widgetID : appWidgetIds) {
      editor.remove(ConfigWidget.WIDGET_CODE+ widgetID);
      editor.remove(ConfigWidget.WIDGET_TEXT + widgetID);
    }
    editor.commit();
    Log.d(LOG_TAG, "onDeleted " + Arrays.toString(appWidgetIds));
  }

  @Override
  public void onDisabled(Context context) {
    super.onDisabled(context);
    Log.d(LOG_TAG, "onDisabled");
  }

  
  
  @Override
  public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
	  super.onUpdate(context, appWidgetManager, appWidgetIds);
      
      SharedPreferences sp = context.getSharedPreferences(
          ConfigWidget.WIDGET_PREF, Context.MODE_PRIVATE);
      for (int id : appWidgetIds) {
        updateWidget(context, appWidgetManager, sp, id);
      }
      
     
      
  }
  static void updateWidget(Context context, AppWidgetManager appWidgetManager,
	      SharedPreferences sp, int widgetID) {
	    Log.d(LOG_TAG, " номер виджета " + widgetID);
	    
	    // Читаем параметры Preferences
	    String widgetcode = sp.getString(ConfigWidget.WIDGET_CODE + widgetID, null);
	    if (widgetcode== null) return;
	    String widgettext = sp.getString(ConfigWidget.WIDGET_TEXT + widgetID, null);
	    
	    // Настраиваем внешний вид виджета
	    RemoteViews views = new RemoteViews(context.getPackageName(),
	        R.layout.smallwidget);	    
	    views.setTextViewText(R.id.Button01, widgettext);
	    
	    Intent intent = new Intent(context, OrangeService.class);
 		 intent.setAction(IntentAction);
 		 intent.putExtra("ussd", widgetcode );
 		PendingIntent pendingIntent = PendingIntent.getService(context, widgetID, intent, Intent.FLAG_ACTIVITY_CLEAR_TASK);
 
 		views.setOnClickPendingIntent(R.id.Button01, pendingIntent);
	    
	    // Обновляем виджет
	    appWidgetManager.updateAppWidget(widgetID, views);
	  }

}