package com.example.easytutonotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button openToDo,openReminder,openDiary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openToDo=(Button)findViewById(R.id.GoToDo);
        openToDo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent redirectToDo = new Intent(getApplicationContext(),ToDo.class);
                startActivity(redirectToDo);
            }
        });
        openReminder=(Button)findViewById(R.id.GoReminder);
        openReminder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent redirectToReminder = new Intent(getApplicationContext(),ReminderTask.class);
                startActivity(redirectToReminder);
            }
        });
        openDiary=(Button)findViewById(R.id.GoDiary);
        openDiary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent redirectToDiary = new Intent(getApplicationContext(),DiaryTask.class);
                startActivity(redirectToDiary);
            }
        });
    }
}