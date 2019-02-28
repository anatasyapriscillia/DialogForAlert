package com.tasya.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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


    public void onClickShowAlert (View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);

        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop: ");

        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(),
                                R.string.pressed_ok,
                                Toast.LENGTH_SHORT).show();
                    }
                });

        myAlertBuilder.setNegativeButton(R.string.cancel_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(),
                                R.string.pressed_cancel,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}