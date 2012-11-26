package wi2010D.Dhbw_app;

import java.io.Console;

import android.os.Bundle;
import android.provider.Settings.System;
import android.app.Activity;
import android.view.Menu;
import android.webkit.ConsoleMessage;

public class StartScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_screen, menu);
		return true;
	}
	
	System.out.println("Hamster");
	

}
