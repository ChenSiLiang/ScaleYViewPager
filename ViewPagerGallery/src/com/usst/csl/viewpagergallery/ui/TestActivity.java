package com.usst.csl.viewpagergallery.ui;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ScaleYViewPager pager = (ScaleYViewPager) findViewById(R.id.pager);
	}
}
