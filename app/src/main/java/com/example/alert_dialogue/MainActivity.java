package com.example.alert_dialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("be alert!")
                .setMessage("follow social rules")
                .setNeutralButton("ok",new DialogInterface.OnClickListener() {

                    @Override
                    public void  onClick(DialogInterface dialog , int which){
                        Toast.makeText(getApplicationContext() ,"hello", Toast.LENGTH_SHORT).show();
                }}).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}