package com.ak.orangeinfo;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class ConfigWidget extends Activity {

int widgetID = AppWidgetManager.INVALID_APPWIDGET_ID;
Intent resultValue;

final String LOG_TAG = "myLogs";

public final static String WIDGET_PREF = "widget_pref";
public final static String WIDGET_TEXT = "widget_text_";
public final static String WIDGET_CODE = "widget_code_";

@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  Log.d(LOG_TAG, "onCreate config");

  // извлекаем ID конфигурируемого виджета
  Intent intent = getIntent();
  Bundle extras = intent.getExtras();
  if (extras != null) {
    widgetID = extras.getInt(AppWidgetManager.EXTRA_APPWIDGET_ID,
        AppWidgetManager.INVALID_APPWIDGET_ID);
  }
  // и проверяем его корректность
  if (widgetID == AppWidgetManager.INVALID_APPWIDGET_ID) {
    finish();
  }
  
  // формируем intent ответа
  resultValue = new Intent();
  resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetID);
  
  // отрицательный ответ
  setResult(RESULT_CANCELED, resultValue);
  
  setContentView(R.layout.configsmallwidget);
}


public void onClick(View v) {
  int selRBColor = ((RadioGroup) findViewById(R.id.smallwidget))
      .getCheckedRadioButtonId();
  String text = null;
  String code = "0"; 
  switch (selRBColor) {
  case R.id.mynumber:
    code = "1";
    text = getString(R.string.my_number_text);
    break;
  case R.id.mycredit:
	    code = "2";
	    text = getString(R.string.credit_text);
	    break;
  case R.id.minuteinfo:
	    code = "3";
	    text = getString(R.string.info_minute_text);
	    break;
  case R.id.balance:
	    code = "4";
	    text = getString(R.string.balance_text);
	    break;
  case R.id.smsinfo:
	    code = "5";
	    text = getString(R.string.smsinfo_text);
	    break;
  case R.id.internet:
	    code = "6";
	    text = getString(R.string.internet_text);
	    break;
  case R.id.calloperator:
	    code = "7";
	    text = getString(R.string.operator_call_text);
	    break;
  case R.id.mynumber1:
	    code = "8";
	    text = getString(R.string.my_number_text);
	    break;
  case R.id.credit1:
	    code = "9";
	    text = getString(R.string.credit_text);
	    break;
  case R.id.minuteinfo1:
	    code = "10";
	    text = getString(R.string.info_minute_text);
	    break;
  case R.id.expense:
	    code = "11";
	    text = getString(R.string.expense_text);
	    break;
  case R.id.minute_bonus:
	    code = "12";
	    text = getString(R.string.bonus_minutes_text);
	    break;
  case R.id.activate_bonus:
	    code = "13";
	    text = getString(R.string.bonus_activate_text);
	    break;
  case R.id.change:
	    code = "14";
	    text = getString(R.string.change_bonus_text);
	    break;
  case R.id.magic:
	    code = "15";
	    text = getString(R.string.magic_number_text);
	    break;
  case R.id.love_number:
	    code = "16";
	    text = getString(R.string.love_number_text);
	    break;
  case R.id.prepay_option:
	    code = "17";
	    text = getString(R.string.prepay_options_text);
	    break;
  case R.id.internet_option:
	    code = "18";
	    text = getString(R.string.internet_options_text);
	    break;
  case R.id.sms_option:
	    code = "19";
	    text = getString(R.string.sms_options_text);
	    break;
  case R.id.minutes_options:
	    code = "20";
	    text = getString(R.string.minutes_options_text);
	    break;
  case R.id.rouming_options:
	    code = "21";
	    text = getString(R.string.rouming_options_text);
	    break;
  case R.id.call_even:
	    code = "22";
	    text = getString(R.string.call_even_text);
	    break;
  case R.id.netactivate:
	    code = "23";
	    text = getString(R.string.internet_activation_text);
	    break;
  case R.id.prepay_point:
	    code = "24";
	    text = getString(R.string.prepay_points_text);
	    break;
  case R.id.calloperator1:
	    code = "25";
	    text = getString(R.string.operator_call_text);
	    break;
  case R.id.RadioButton05:
	    code = "26";
	    text = getString(R.string.emergency_text);
	    break;
  case R.id.RadioButton04:
	    code = "27";
	    text = getString(R.string.firefighters_text);
	    break;
  case R.id.RadioButton03:
	    code = "28";
	    text = getString(R.string.police_text);
	    break;
  case R.id.RadioButton02:
	    code = "29";
	    text = getString(R.string.ambulance_text);
	    break;
  case R.id.RadioButton01:
	    code = "30";
	    text = getString(R.string.gas_service_text);
	    break;
	    
  }
 
  SharedPreferences sp = getSharedPreferences(WIDGET_PREF, MODE_PRIVATE);
  Editor editor = sp.edit();
  editor.putString(WIDGET_CODE + widgetID, code );
  editor.putString(WIDGET_TEXT + widgetID, text);
  editor.commit();
  AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
  SmallWidget.updateWidget(this, appWidgetManager, sp, widgetID);
  // положительный ответ 
  setResult(RESULT_OK, resultValue);
  
  Log.d(LOG_TAG, "finish config " + widgetID);
  finish();
}
}
