package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    public void showMessage(View view){
        String message = getResources().getString(R.string.toast_prefix);
        switch (view.getId()){
            case R.id.spotify_streamer_btn:
                message+=getResources().getString(R.string.spotify_streamer_text); break;
            case R.id.football_scores_btn:
                message+=getResources().getString(R.string.football_scores_text); break;
            case R.id.library_app_btn:
                message+=getResources().getString(R.string.library_app_toast_text); break;
            case R.id.build_it_bigger_btn:
                message+=getResources().getString(R.string.build_it_bigger_text); break;
            case R.id.xyz_reader_btn:
                message+=getResources().getString(R.string.xyz_reader_text); break;
            case R.id.capstone_btn:
                message+=getResources().getString(R.string.capstone_toast_text); break;
        }
        message+=getResources().getString(R.string.toast_suffix);
        Toast toast = Toast.makeText(this,message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
