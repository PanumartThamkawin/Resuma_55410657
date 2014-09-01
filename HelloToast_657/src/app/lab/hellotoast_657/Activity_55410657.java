package app.lab.hellotoast_657;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Activity_55410657 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_55410657);
        Toast.makeText(Activity_55410657.this, "OnCreate", Toast.LENGTH_SHORT).show();
    }//End Create
    
   
   @Override
protected void onStart() {
	// TODO Auto-generated method stub
	super.onStart();
	Toast.makeText(Activity_55410657.this, "OnStart", Toast.LENGTH_SHORT).show();
}
   @Override
protected void onRestart() {
	// TODO Auto-generated method stub
	super.onRestart();
	Toast.makeText(Activity_55410657.this, "onRestart", Toast.LENGTH_SHORT).show();
}
   @Override
   protected void onPause() {
   	// TODO Auto-generated method stub
   	super.onPause();
   	Toast.makeText(Activity_55410657.this, "onPause", Toast.LENGTH_SHORT).show();
   }
   @Override
   protected void onStop() {
   	// TODO Auto-generated method stub
   	super.onStop();
	Toast.makeText(Activity_55410657.this, "onStop", Toast.LENGTH_SHORT).show();
   }
  
   @Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	Toast.makeText(Activity_55410657.this, "onDestroy", Toast.LENGTH_SHORT).show();
}
   @Override
   protected void onResume() {
   	// TODO Auto-generated method stub
   	super.onResume();
   	Toast.makeText(Activity_55410657.this, "onResume", Toast.LENGTH_SHORT).show();
   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_55410657, menu);
        return true;
    }
  
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onRestoreInstanceState(savedInstanceState);
    	Toast.makeText(Activity_55410657.this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
