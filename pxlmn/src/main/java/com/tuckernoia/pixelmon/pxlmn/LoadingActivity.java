package com.tuckernoia.pixelmon.pxlmn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;


public class LoadingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

}
