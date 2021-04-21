package com.example.autoconsent;

import android.app.AlertDialog;
import android.view.Window;

public class PersonalDataConsent {

    public static void ShowPopup(android.content.Context context) {
        final AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.show();
        final Window window = dialog.getWindow();
        window.setContentView(R.layout.dialog_main);
    }
}
