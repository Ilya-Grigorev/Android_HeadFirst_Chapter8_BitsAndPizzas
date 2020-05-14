package com.example.bitsandpizzas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import android.widget.Toast;


import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;


public class MainActivity extends AppCompatActivity {


    public ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }


    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.layout.menu_main, menu);

        MenuItem menuItem = menu.findItem(R.id.action_share);
        mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Want to join me for pizza?");

        return super.onCreateOptionsMenu(menu);

    }


    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        mShareActionProvider.setShareIntent(intent);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int ImemID = item.getItemId();

        switch (ImemID) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem3:
                Toast.makeText(this, "Sub Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_create_order:
                Toast.makeText(this, "Create order action", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, activity_order.class);
                startActivity(intent);

                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
