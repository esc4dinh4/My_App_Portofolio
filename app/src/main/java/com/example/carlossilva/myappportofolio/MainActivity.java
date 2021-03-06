package com.example.carlossilva.myappportofolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void appButtonHandler (View view) {

        int btnId = view.getId();
        Button b = (Button)view;


        String appName = null;

        switch (btnId) {
            case R.id.button0:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " +appName+ "app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " + appName + " App ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " + appName + " App ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " + appName + " App ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " + appName + " App ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                appName = b.getText().toString();
                Toast.makeText(MainActivity.this, "This Button will lunch " + appName + " App ", Toast.LENGTH_SHORT).show();
                break;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button0 = (Button) findViewById(R.id.button0);
//        Button button1 = (Button) findViewById(R.id.button1);
//        Button button2 = (Button) findViewById(R.id.button2);
//        Button button3 = (Button) findViewById(R.id.button3);
//        Button button4 = (Button) findViewById(R.id.button4);
//        Button button5 = (Button) findViewById(R.id.button5);








        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
