package com.hacknplay.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendToast(View view) {
        String toastText = new String();
        switch (view.getId()) {
            case R.id.button:
                toastText = getResources().getString(R.string.media_streamer);
                break;
            case R.id.button2:
                toastText = getResources().getString(R.string.super_duo1);
                break;
            case R.id.button3:
                toastText = getResources().getString(R.string.super_duo2);
                break;
            case R.id.button4:
                toastText = getResources().getString(R.string.ant_terminator);
                break;
            case R.id.button5:
                toastText = getResources().getString(R.string.materialize);
                break;
            case R.id.button6:
                toastText = getResources().getString(R.string.my_own_app);
                break;
            default:
                toastText = "Nothing special";
        }

        Toast.makeText(this, "This button will launch " + toastText, Toast.LENGTH_SHORT).show();
    }

}
