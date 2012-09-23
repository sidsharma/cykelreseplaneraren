package com.electronixid.sthlm.cyclepath;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CyclePathPreferencesActivity extends ListActivity {
    
    private enum listIndex {
            SETTING1,
            SETTING2
    };
    private ListView optionList;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        optionList = (ListView) findViewById(R.id.preferences);
    }
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info;
        switch (item.getItemId()) {
        default:
            return super.onContextItemSelected(item);
        }
        
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        
        startActivity(new Intent(Intent.ACTION_PICK_ACTIVITY));
    }

}
