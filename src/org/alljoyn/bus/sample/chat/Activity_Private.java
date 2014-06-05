package org.alljoyn.bus.sample.chat;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */

import android.os.Bundle;

public class Activity_Private extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);
        setHeader(getString(R.string.PrivateActivityTitle), true, true);
        
    }
}
