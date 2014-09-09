package hm.orz.bluefish.serialtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("tag",">>>>onCreate");
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.d("tag",">>>>Click!");
	        }
		});
		
	}
	
    @Override
    public void onStart() {
    	super.onStart();
		Log.d("tag",">>>>onStart");
    }
}
