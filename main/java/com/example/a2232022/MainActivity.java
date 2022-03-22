package com.example.a2232022;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
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

    public void onToggleClicked(View view) {

        boolean checked = ((ToggleButton)view).isChecked();
        TextView textView1 = (TextView) findViewById(R.id.textview1);
        if (checked) {
            textView1.setBackgroundColor(Color.parseColor("#FFFF00"));
            // uključeno
        } else {
            textView1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            // isključeno
        }
    }

    public void prikaziPoruku(View view) {
        RadioButton negativni = (RadioButton) findViewById(R.id.radioButtonNegativnih);
        RadioButton nula = (RadioButton) findViewById(R.id.radioButtonNula);
        RadioButton parni = (RadioButton) findViewById(R.id.radioButtonParnih);
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        TextView textView1 = (TextView) findViewById(R.id.textview1);

        if(negativni.isChecked())
        {
            try
            {
                int broj = 0;
                if(Integer.parseInt(editText1.getText().toString()) < 0)
                    broj++;
                if(Integer.parseInt(editText2.getText().toString()) < 0)
                    broj++;

                textView1.setText("Broj negativnih = " + broj);
            }
            catch (Exception ex){}
        }
        if(nula.isChecked())
        {
            try
            {
                int broj = 0;
                if(Integer.parseInt(editText1.getText().toString()) == 0)
                    broj++;
                if(Integer.parseInt(editText2.getText().toString()) == 0)
                    broj++;

                textView1.setText("Broj nula = " + broj);
            }
            catch (Exception ex){}
        }

        if(parni.isChecked())
        {
            try
            {
                int broj = 0;
                if(Integer.parseInt(editText1.getText().toString()) % 2 == 0)
                    broj++;
                if(Integer.parseInt(editText2.getText().toString()) % 2 == 0)
                    broj++;

                textView1.setText("Broj parnih = " + broj);
            }
            catch (Exception ex){}
        }
    }

}