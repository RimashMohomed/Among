package org.alljoyn.bus.sample.chat;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setHeader(getString(R.string.HomeActivityTitle), false, true);
        
    }
    
    public void onButtonClicker(View v)
    {
    	Intent intent;
    	
    	switch (v.getId()) {
		case R.id.main_btn_eclair:
			intent = new Intent(this, Activity_Public.class);
			startActivity(intent);
			break;

		case R.id.main_btn_froyo:
			intent = new Intent(this, Activity_Private.class);
			startActivity(intent);
			break;
			
		}
    }
}

