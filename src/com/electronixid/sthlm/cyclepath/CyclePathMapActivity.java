package com.electronixid.sthlm.cyclepath;

import java.util.List;

import com.electronixid.sthlm.cyclepath.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.widget.Toast;

public class CyclePathMapActivity extends MapActivity {
	/** Called when the activity is first created. */

	MapController mapController;
	OverlayItem currentLocation;
	GeoPoint myGeoPoint;
	List<Overlay> mapOverlays;
	MyLocationOverlay myLocationOverlay;

	MapView mapView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);

		mapView = (MapView) findViewById(R.id.mapview);
		mapView.setBuiltInZoomControls(true);
		mapView.setClickable(true);
		mapView.setEnabled(true);

		mapController = mapView.getController();

		myLocationOverlay = new MyLocationOverlay(this, mapView);
		myLocationOverlay.enableMyLocation();
		myLocationOverlay.runOnFirstFix(new Runnable() { public void run() {
			myGeoPoint = myLocationOverlay.getMyLocation();
			mapController.animateTo(myGeoPoint);
			mapController.setCenter(myGeoPoint);
			mapController.setZoom(15);
		}});

		mapOverlays = mapView.getOverlays();
		mapOverlays.add(myLocationOverlay);
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.map_options, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_route:
			Toast.makeText(getApplicationContext(), "Unimplemented Feature", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_saved_routes:
			Toast.makeText(getApplicationContext(), "Unimplemented Feature", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_navigate:
			Toast.makeText(getApplicationContext(), "Unimplemented Feature", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_layers:
			startActivity(new Intent(this, CyclePathLayersActivity.class));
			return true;
		case R.id.menu_my_location:
			Toast.makeText(getApplicationContext(), "Unimplemented Feature", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.menu_settings:
			startActivity(new Intent(this, CyclePathPreferencesActivity.class));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}