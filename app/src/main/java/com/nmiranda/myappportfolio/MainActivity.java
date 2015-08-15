package com.nmiranda.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonStreamer, mButtonScores, mButtonLibrary, mButtonBuildItBigger, mButtonXyzReader, mButtonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();
        setOnClickListeners();
    }

    private void getViews() {
        mButtonStreamer = (Button) findViewById(R.id.btn_streamer);
        mButtonScores = (Button) findViewById(R.id.btn_scores);
        mButtonLibrary = (Button) findViewById(R.id.btn_library);
        mButtonBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        mButtonXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        mButtonCapstone = (Button) findViewById(R.id.btn_capstone_project);
    }

    private void setOnClickListeners() {
        mButtonStreamer.setOnClickListener(this);
        mButtonScores.setOnClickListener(this);
        mButtonLibrary.setOnClickListener(this);
        mButtonBuildItBigger.setOnClickListener(this);
        mButtonXyzReader.setOnClickListener(this);
        mButtonCapstone.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_streamer:
                displayMessage(getResources().getString(R.string.toast_message_streamer));
                break;
            case R.id.btn_scores:
                displayMessage(getResources().getString(R.string.toast_message_scores));
                break;
            case R.id.btn_library:
                displayMessage(getResources().getString(R.string.toast_message_library));
                break;
            case R.id.btn_build_it_bigger:
                displayMessage(getResources().getString(R.string.toast_message_build_it_biggger));
                break;
            case R.id.btn_xyz_reader:
                displayMessage(getResources().getString(R.string.toast_message_xyz_reader));
                break;
            case R.id.btn_capstone_project:
                displayMessage(getResources().getString(R.string.toast_message_capstone));
                break;
        }
    }

    private void displayMessage(String app) {
        Toast.makeText(this, getResources().getString(R.string.toast_button_clicked) + " " + app,Toast.LENGTH_LONG).show();
    }

}
