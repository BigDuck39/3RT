package com.example.a832022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipkaPritisnutaList(View view) {
        TextView textView1 = (TextView) findViewById(R.id.textViewIspis);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setItems(R.array.odabir_gumba, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        textView1.setText("" + (Integer.parseInt(textView1.getText().toString()) - 1));
                        break;
                    case 1:
                        textView1.setText("" + (Integer.parseInt(textView1.getText().toString()) + 1));
                        break;
                    case 2:
                        textView1.setText("" + (Integer.parseInt(textView1.getText().toString()) + 2));
                        break;
                }
            }
        });
        builder.show();
    }

    boolean odabrano[] = {true, false, true};
    final CharSequence poljeNazivi[] = { "-1", "+1", "+2" };

    public void tipkaPritisnutaCheck(View view) {
        TextView textView1 = (TextView) findViewById(R.id.textViewIspis);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Odaberi:");

        builder.setMultiChoiceItems(poljeNazivi, odabrano, new DialogInterface.OnMultiChoiceClickListener() {
            public void onClick(DialogInterface dialog, int id, boolean b) {
                //Toast.makeText(((AlertDialog)dialog).getContext(), "Item", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("Fire", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                String poruka = "";
                for(int i =0; i<odabrano.length; i++)
                {
                    if (odabrano[i]==true)
                        textView1.setText("" + (Integer.parseInt(textView1.getText().toString()) + Integer.parseInt(poljeNazivi[i].toString())));
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.show();
    }

    int sel=0;
    public void tipkaPritisnutaRadio(View view) {
        TextView textView1 = (TextView) findViewById(R.id.textViewIspis);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setSingleChoiceItems(poljeNazivi, sel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                sel = id;
                //Toast.makeText(((AlertDialog)dialog).getContext(), "Item", Toast.LENGTH_SHORT).show();
            }});
        builder.setPositiveButton("Fire", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                textView1.setText("" + (Integer.parseInt(textView1.getText().toString()) + Integer.parseInt(poljeNazivi[sel].toString())));
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.show();
    }

}