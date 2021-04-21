package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.autoconsent.PersonalDataAnnotation;
import com.example.autoconsent.PersonalDataConsent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // this is the test annotation
        setContentView(R.layout.activity_main);
    }

//    @PersonalDataAnnotation(
//            purpose = {"Provide accurate location information"},
//            dataType = {PersonalDataType.fine_grained_location}
//    )

    @PersonalDataAnnotation(name = "High-Accuracy Location", description = "personalised third-party advertising")
    public void locationTransfer() {
        // location transfer code
    }

    public void onDialogClick(View v){
        PersonalDataConsent.ShowPopup(MainActivity.this);
    }
}
