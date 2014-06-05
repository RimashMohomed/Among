package org.alljoyn.bus.sample.chat;


import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Activity_Public extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);
        setHeader(getString(R.string.PublicActivityTitle), true, true);        
        //Bundle b = getIntent().getExtras();
        //TextView name = (TextView) findViewById(R.id.textView1);
        //name.setText(b.getCharSequence("name"));
        
        
        
        
     // 1. get passed intent 
      //  Intent intent = getIntent();
 
        // 2. get message value from intent
       // String message = intent.getStringExtra("message");
 
        // 3. show message on textView 
        //((TextView)findViewById(R.id.textView1)).setText(message);
        
    }
}
