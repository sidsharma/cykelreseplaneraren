package com.electronixid.sthlm.cyclepath.osm;

import org.osmdroid.views.MapView;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class OpenStreetMapActivity extends Activity {

	protected MapView openStreetMapView;

	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {

	}

	@Override
	public boolean onTrackballEvent(final MotionEvent event) {
		return this.openStreetMapView.onTrackballEvent(event);
	}

	@Override
	public boolean onTouchEvent(final MotionEvent event) {
		return super.onTouchEvent(event);
	}

}
