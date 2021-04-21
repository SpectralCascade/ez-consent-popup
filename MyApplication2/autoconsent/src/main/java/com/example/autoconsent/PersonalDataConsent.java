package com.example.autoconsent;

import android.app.AlertDialog;
import android.view.Window;

public class PersonalDataConsent {

    //@PersonalDataAnnotation
    private static String[] dataTypes = {"High-Accuracy Location", "Telephony ID", "Phone Number"};
    private static String[] transferPurposes = {"personalised third-party advertising", "hardware identification for checking personal data transfer consent",
            "personalised third-party advertising"};

    public static void ShowPopup(android.content.Context context) {
        String purposes = "";
        for (int i = 0, counti = dataTypes.length; i < counti; i++) {
            purposes += "\n  - " + dataTypes[i] + ": " + transferPurposes[i];
        }

        //View dialogView = LayoutInflater.from(context).inflate(R.layout.bg_test,null);

//        new AlertDialog.Builder(context)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("Personal Data Usage")
//                .setMessage("This application transfers personal data to third parties for a number of purposes." +
//                        "To allow these transfers to take place, you may press the grant consent button. These purposes are: \n" +
//                        purposes
//                )
//                .setPositiveButton("Grant Consent", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int whichButton) {
//                        //finish();//Exit Activity
//                    }
//                })
//                .setNegativeButton("Deny consent", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int whichButton) {
//                            }
//                        }
//                ).create().show();

        final AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.show();
        final Window window = dialog.getWindow();
        window.setContentView(R.layout.dialog_main);
        //window.findViewById(R.id.txtDocumentNumber);
    }
}
