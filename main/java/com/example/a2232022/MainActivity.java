package com.example.a2232022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prikaziPoruku(View view) {
        CheckBox spojeno = (CheckBox) findViewById(R.id.checkBoxSpojeno);
        CheckBox duljina = (CheckBox) findViewById(R.id.checkBoxDuljina);
        CheckBox duzi = (CheckBox) findViewById(R.id.checkBoxDuziString);
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        EditText editText2 = (EditText) findViewById(R.id.edittext2);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Odaberi trajanje:");
        builder.setItems(R.array.odabir_trajanja, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                String str = "";
                int i = 0;

                if(spojeno.isChecked())
                {
                    str+="Spojeno = " + editText1.getText().toString() + editText2.getText().toString();
                    i++;
                }
                if(duljina.isChecked())
                {
                    if(i > 0)
                        str += "\n";
                    int len = editText1.getText().toString().length();
                    len += editText2.getText().toString().length();
                    str+="Ukupna duljina = " + len;
                    i++;
                }
                if(duzi.isChecked())
                {
                    if(i > 0)
                        str += "\n";
                    if(editText1.getText().toString().length() > editText2.getText().toString().length())
                        str+="Duži string = " + editText1.getText().toString();
                    else
                        str+="Duži string = " + editText2.getText().toString();
                }
                switch (which) {
                    case 0:
                        Toast.makeText(((AlertDialog)dialog).getContext(), str, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(((AlertDialog)dialog).getContext(), str, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        builder.show();

    }

}