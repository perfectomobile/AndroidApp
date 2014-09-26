package com.example.superapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchActivitiy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_activitiy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_activitiy, menu);
		return true;
	}

}
