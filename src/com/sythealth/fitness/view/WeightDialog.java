package com.sythealth.fitness.view;

import com.sythealth.fitness.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class WeightDialog extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.view_weight);
	}
}
