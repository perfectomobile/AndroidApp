package com.example.superapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	
	EditText mEdit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.button1);
		 mEdit   = (EditText)findViewById(R.id.user);

	    button.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
	    	  String val = mEdit.getText().toString();
	    	  
	    	  if (val.equals("ttt"))
	    	  {
	    		  Intent i = new Intent(MainActivity.this, SearchActivitiy.class);
 	    	      startActivity(i); 
	    	  }
	    	  else
	    	  {
	    		  msbox ("Uzi",val);
	    	  }
	    	  
 	      }
	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void msbox(String str,String str2)
	{
	    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);                      
	    dlgAlert.setTitle(str); 
	    dlgAlert.setMessage(str2); 
	    dlgAlert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
	        public void onClick(DialogInterface dialog, int whichButton) {
	        	  
	             finish(); 
	        }
	   });
	    dlgAlert.setCancelable(true);
	    dlgAlert.create().show();
	}
}
