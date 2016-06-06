package com.nathansass.todoapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class EditItemActivity extends AppCompatActivity {
    Context context;
    int duration;

    int position;
    String todoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

         /* Toast Things*/
        context = getApplicationContext();
        duration = Toast.LENGTH_SHORT;

        /* Get intent */
        position = getIntent().getIntExtra("position", -1);
        todoContent = getIntent().getStringExtra("content");

        Toast.makeText(context, position + ". " + todoContent, duration).show();
    }
}
