package com.example.portfolioapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchCVActivity(View view)
    {
        Intent cvIntent = new Intent(this, CVActivity.class);
        startActivity(cvIntent);

        String launchingMainMessage = "Feel Free to View My Profile";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();
    }
}
