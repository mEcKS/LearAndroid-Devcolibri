package com.company.mexus.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by m.chmil on 22.06.2015.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public  void showDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Mexus")
                .setMessage("This is information message")
                .setCancelable(true)
                        .setIcon(R.mipmap.ic_launcher)
                //.setCancelable(false) // true - modal, false - no modal
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You don't agree with us", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Yes!!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "You agree with us", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener(){
                        @Override
                        public void onCancel(DialogInterface dialog){
                            Toast.makeText(getApplicationContext(), "You ignore us :(", Toast.LENGTH_SHORT).show();
                        }

                }) ;

        AlertDialog alert = builder.create();
        alert.show();
    }
}
