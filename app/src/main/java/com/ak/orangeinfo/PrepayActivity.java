package com.ak.orangeinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class PrepayActivity extends Activity {
	
	TextView textview,TextView08,TextView06,TextView04,TextView01,TextView02,TextView03,TextView05,TextView07,TextView10,TextView11,TextView12,TextView13,TextView14,
	TextView15,TextView16,TextView17,TextView18,TextView19,TextView20,TextView21,TextView22,TextView23;
	Button button1,Button01,Button02,Button03,Button04,Button05,Button06,Button07,Button08,Button09,Button10,Button11,Button12,Button13,Button14,Button15,Button16,
	Button17,Button18,Button19,Button20,Button21,Button22;
	boolean isRegistered;
	Context mContext;
	final String LOG_TAG = "OrangeLogs";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.prepay);
	    
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
	    Button12 = (Button) findViewById(R.id.Button12);
	    Button13 = (Button) findViewById(R.id.Button13);
	    Button14 = (Button) findViewById(R.id.Button14);
	    Button15 = (Button) findViewById(R.id.Button15);
	    Button16 = (Button) findViewById(R.id.Button16);
	    Button17 = (Button) findViewById(R.id.Button17);
	    Button18 = (Button) findViewById(R.id.Button18);
	    Button19 = (Button) findViewById(R.id.Button19);
	    Button20 = (Button) findViewById(R.id.Button20);
	    Button21 = (Button) findViewById(R.id.Button21);
	    Button22 = (Button) findViewById(R.id.Button22);
	    
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
	    TextView15 =(TextView) findViewById(R.id.TextView15);
	    TextView16 =(TextView) findViewById(R.id.TextView16);
	    TextView17 =(TextView) findViewById(R.id.TextView17);
	    TextView18 =(TextView) findViewById(R.id.TextView18);
	    TextView19 =(TextView) findViewById(R.id.TextView19);
	    TextView20 =(TextView) findViewById(R.id.TextView20);
	    TextView21 =(TextView) findViewById(R.id.TextView21);
	    TextView22 =(TextView) findViewById(R.id.TextView22);
	    TextView23 =(TextView) findViewById(R.id.TextView23);
	    
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
	    Button12.startAnimation(left);
	    Button13.startAnimation(left);
	    Button14.startAnimation(left);
	    Button15.startAnimation(left);
	    Button16.startAnimation(left);
	    Button17.startAnimation(left);
	    Button18.startAnimation(left);
	    Button19.startAnimation(left);
	    Button20.startAnimation(left);
	    Button21.startAnimation(left);
	    Button22.startAnimation(left);
	    
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
	    TextView15.startAnimation(right);
	    TextView16.startAnimation(right);
	    TextView17.startAnimation(right);
	    TextView18.startAnimation(right);
	    TextView19.startAnimation(right);
	    TextView20.startAnimation(right);
	    TextView21.startAnimation(right);
	    TextView22.startAnimation(right);
	    TextView23.startAnimation(right);
	    
	    
	    OnClickListener sendussd1 = new OnClickListener() {
		       @Override
		       public void onClick(View v) {
		    	   
		    	   String ussd = getString(R.string.my_number);
		    	   startActivityForResult(new Intent("android.intent.action.CALL",
		    	   Uri.parse("tel:" + ussd)), 1);
		    	   
		       }
		     };
		 
		     // присвоим обработчик кнопке OK (btnOk)
		     Button21.setOnClickListener(sendussd1);
		     
		     OnClickListener sendussd2 = new OnClickListener() {
			       @Override
			       public void onClick(View v) {
			    	   
			    	   String ussd = getString(R.string.credit);
			    	   startActivityForResult(new Intent("android.intent.action.CALL",
			    	   Uri.parse("tel:" + ussd)), 1);
			    	   
			       }
			     };
			 
			     // присвоим обработчик кнопке OK (btnOk)
			     Button20.setOnClickListener(sendussd2);
		    
			     OnClickListener sendussd3 = new OnClickListener() {
				       @Override
				       public void onClick(View v) {
				    	   
				    	   String ussd = getString(R.string.info_minute);
				    	   startActivityForResult(new Intent("android.intent.action.CALL",
				    	   Uri.parse("tel:" + ussd)), 1);
				    	   
				       }
				     };
				 
				     // присвоим обработчик кнопке OK (btnOk)
				     Button19.setOnClickListener(sendussd3);
				    
				 OnClickListener sendussd4 = new OnClickListener() {
					       @Override
					       public void onClick(View v) {
					    	   
					    	   String ussd = getString(R.string.expense);
					    	   startActivityForResult(new Intent("android.intent.action.CALL",
					    	   Uri.parse("tel:" + ussd)), 1);
					    	   
					       }
					     };
					 
					     // присвоим обработчик кнопке OK (btnOk)
					     Button18.setOnClickListener(sendussd4);
		  
					     OnClickListener sendussd5 = new OnClickListener() {
						       @Override
						       public void onClick(View v) {
						    	   
						    	   String ussd = getString(R.string.bonus_minutes);
						    	   startActivityForResult(new Intent("android.intent.action.CALL",
						    	   Uri.parse("tel:" + ussd)), 1);
						    	   
						       }
						     };
						 
						     // присвоим обработчик кнопке OK (btnOk)
						     Button22.setOnClickListener(sendussd5);
						     
						     OnClickListener sendussd6 = new OnClickListener() {
							       @Override
							       public void onClick(View v) {
							    	   
							    	   String ussd = getString(R.string.bonus_activate);
							    	   startActivityForResult(new Intent("android.intent.action.CALL",
							    	   Uri.parse("tel:" + ussd)), 1);
							    	   
							       }
							     };
							 
							     // присвоим обработчик кнопке OK (btnOk)
							     Button12.setOnClickListener(sendussd6);
							     
							     
							     OnClickListener sendussd7 = new OnClickListener() {
								       @Override
								       public void onClick(View v) {
								    	   
								    	   String ussd = getString(R.string.change_bonus);
								    	   startActivityForResult(new Intent("android.intent.action.CALL",
								    	   Uri.parse("tel:" + ussd)), 1);
								    	   
								       }
								     };
								 
								     // присвоим обработчик кнопке OK (btnOk)
								     Button15.setOnClickListener(sendussd7);
								     
								     
								     OnClickListener sendussd8 = new OnClickListener() {
									       @Override
									       public void onClick(View v) {
									    	   
									    	   String ussd = getString(R.string.magic_number);
									    	   startActivityForResult(new Intent("android.intent.action.CALL",
									    	   Uri.parse("tel:" + ussd)), 1);
									    	   
									       }
									     };
									 
									     // присвоим обработчик кнопке OK (btnOk)
									     Button16.setOnClickListener(sendussd8);
									     
									     
									     OnClickListener sendussd9 = new OnClickListener() {
										       @Override
										       public void onClick(View v) {
										    	   
										    	   String ussd = getString(R.string.love_number);
										    	   startActivityForResult(new Intent("android.intent.action.CALL",
										    	   Uri.parse("tel:" + ussd)), 1);
										    	   
										       }
										     };
										 
										     // присвоим обработчик кнопке OK (btnOk)
										     Button13.setOnClickListener(sendussd9);
										     
										     
		OnClickListener sendussd10 = new OnClickListener() {
	    @Override
		public void onClick(View v) {
											    	   
			String ussd = getString(R.string.prepay_options);
			startActivityForResult(new Intent("android.intent.action.CALL",
			Uri.parse("tel:" + ussd)), 1);
											    	   
				}
			};
											 
		  // присвоим обработчик кнопке OK (btnOk)
		Button14.setOnClickListener(sendussd10);
		
		
		OnClickListener sendussd11 = new OnClickListener() {
		       @Override
		       public void onClick(View v) {
		    	   
		    	   String ussd = getString(R.string.internet_options);
		    	   startActivityForResult(new Intent("android.intent.action.CALL",
		    	   Uri.parse("tel:" + ussd)), 1);
		    	   
		       }
		     };
		 
		     // присвоим обработчик кнопке OK (btnOk)
		     Button05.setOnClickListener(sendussd11);
		     
		     OnClickListener sendussd12 = new OnClickListener() {
			       @Override
			       public void onClick(View v) {
			    	   
			    	   String ussd = getString(R.string.sms_options);
			    	   startActivityForResult(new Intent("android.intent.action.CALL",
			    	   Uri.parse("tel:" + ussd)), 1);
			    	   
			       }
			     };
			 
			     // присвоим обработчик кнопке OK (btnOk)
			     button1.setOnClickListener(sendussd12);
			     
			     OnClickListener sendussd13 = new OnClickListener() {
				       @Override
				       public void onClick(View v) {
				    	   
				    	   String ussd = getString(R.string.minutes_options);
				    	   startActivityForResult(new Intent("android.intent.action.CALL",
				    	   Uri.parse("tel:" + ussd)), 1);
				    	   
				       }
				     };
				 
				     // присвоим обработчик кнопке OK (btnOk)
				     Button01.setOnClickListener(sendussd13);
				     
				     
				     OnClickListener sendussd14 = new OnClickListener() {
					       @Override
					       public void onClick(View v) {
					    	   
					    	   String ussd = getString(R.string.rouming_options);
					    	   startActivityForResult(new Intent("android.intent.action.CALL",
					    	   Uri.parse("tel:" + ussd)), 1);
					    	   
					       }
					     };
					 
					     // присвоим обработчик кнопке OK (btnOk)
					     Button02.setOnClickListener(sendussd14);
					     
					     OnClickListener sendussd15 = new OnClickListener() {
						       @Override
						       public void onClick(View v) {
						    	   
						    	   String ussd = getString(R.string.call_even);
						    	   startActivityForResult(new Intent("android.intent.action.CALL",
						    	   Uri.parse("tel:" + ussd)), 1);
						    	   
						       }
						     };
						 
						     // присвоим обработчик кнопке OK (btnOk)
						     Button03.setOnClickListener(sendussd15);
						     
						     
						     OnClickListener sendussd16 = new OnClickListener() {
							       @Override
							       public void onClick(View v) {
							    	   
							    	   String ussd = getString(R.string.internet_activation);
							    	   startActivityForResult(new Intent("android.intent.action.CALL",
							    	   Uri.parse("tel:" + ussd)), 1);
							    	   
							       }
							     };
							 
							     // присвоим обработчик кнопке OK (btnOk)
							     Button04.setOnClickListener(sendussd16);
							     
							     
OnClickListener sendussd17 = new OnClickListener() {
 @Override
 public void onClick(View v) {
								    	   
String ussd = getString(R.string.prepay_points);
startActivityForResult(new Intent("android.intent.action.CALL",
Uri.parse("tel:" + ussd)), 1);
								    	   
	 }
 };
								 
 // присвоим обработчик кнопке OK (btnOk)
Button06.setOnClickListener(sendussd17);


OnClickListener sendussd18 = new OnClickListener() {
    @Override
    public void onClick(View v) {
 	   
 	   String ussd = getString(R.string.operator_call);
 	   startActivityForResult(new Intent("android.intent.action.CALL",
 	   Uri.parse("tel:" + ussd)), 1);
 	   
    }
  };

  // присвоим обработчик кнопке OK (btnOk)
  Button17.setOnClickListener(sendussd18);
  
  OnClickListener sendussd19 = new OnClickListener() {
      @Override
      public void onClick(View v) {
   	   
   	   String ussd = getString(R.string.emergency);
   	   startActivityForResult(new Intent("android.intent.action.CALL",
   	   Uri.parse("tel:" + ussd)), 1);
   	   
      }
    };

    // присвоим обработчик кнопке OK (btnOk)
    Button07.setOnClickListener(sendussd19);
    
    OnClickListener sendussd20 = new OnClickListener() {
        @Override
        public void onClick(View v) {
     	   
     	   String ussd = getString(R.string.firefighters);
     	   startActivityForResult(new Intent("android.intent.action.CALL",
     	   Uri.parse("tel:" + ussd)), 1);
     	   
        }
      };

      // присвоим обработчик кнопке OK (btnOk)
      Button08.setOnClickListener(sendussd20);
      
      OnClickListener sendussd21 = new OnClickListener() {
          @Override
          public void onClick(View v) {
       	   
       	   String ussd = getString(R.string.police);
       	   startActivityForResult(new Intent("android.intent.action.CALL",
       	   Uri.parse("tel:" + ussd)), 1);
       	   
          }
        };

        // присвоим обработчик кнопке OK (btnOk)
        Button09.setOnClickListener(sendussd21);
        
        OnClickListener sendussd22 = new OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   String ussd = getString(R.string.ambulance);
         	   startActivityForResult(new Intent("android.intent.action.CALL",
         	   Uri.parse("tel:" + ussd)), 1);
         	   
            }
          };

          // присвоим обработчик кнопке OK (btnOk)
          Button10.setOnClickListener(sendussd22);
          
          OnClickListener sendussd23 = new OnClickListener() {
              @Override
              public void onClick(View v) {
           	   
           	   String ussd = getString(R.string.gas_service);
           	   startActivityForResult(new Intent("android.intent.action.CALL",
           	   Uri.parse("tel:" + ussd)), 1);
           	   
              }
            };

            // присвоим обработчик кнопке OK (btnOk)
            Button11.setOnClickListener(sendussd23);
							     
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
