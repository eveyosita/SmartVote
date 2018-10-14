package com.example.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button checkB = findViewById(R.id.check_button);
        checkB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText noText = findViewById(R.id.no_editText);
                String num = noText.getText().toString();

                if(num.length()<13){
                    String message = "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก";
                    Toast t = Toast.makeText(Main2Activity.this, message, Toast.LENGTH_LONG);
                    t.show();

                } else {
                    if(num.equals("1111111111111") || num.equals("2222222222222")){
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setCancelable(false);
                        dialog.show();
                    } else {
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");

                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setCancelable(false);
                        dialog.show();
                    }
                }
            }
        });


    }
}
