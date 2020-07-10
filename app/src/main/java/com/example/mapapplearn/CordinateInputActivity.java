package com.example.mapapplearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CordinateInputActivity extends AppCompatActivity {

    EditText e_latitude,e_longitude;
    Button b_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordinate_input);

        e_latitude=(EditText)findViewById(R.id.txt_latitude);
        e_longitude=(EditText)findViewById(R.id.txt_longitute);
        b_send=(Button)findViewById(R.id.btn_send_location);
    }

    public void send_coodinates(View view){
        String n1,n2;
        n1=e_latitude.getText().toString();
        n2=e_longitude.getText().toString();


        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("latitude",n1);
        intent.putExtra("longitude",n2);

        startActivity(intent);

    }
}