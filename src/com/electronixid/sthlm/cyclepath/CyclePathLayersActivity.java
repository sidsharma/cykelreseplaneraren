package com.electronixid.sthlm.cyclepath;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CyclePathLayersActivity extends ListActivity {
    
    private ListView optionList;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        optionList = (ListView) findViewById(R.id.layers);
    }

}
